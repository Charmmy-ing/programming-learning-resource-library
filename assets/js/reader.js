// 笔记阅读器：marked + highlight.js 渲染 + 目录
const params = new URLSearchParams(location.search);
const file = params.get('file');
const contentEl = document.getElementById('content');
const tocEl = document.getElementById('toc');

// 下载按钮：GitHub 公共仓库直链
if (file) {
  const dl = document.getElementById('dl-btn');
  dl.href = 'https://github.com/Charmmy-ing/programming-learning-resource-library/raw/main/' + encodeURI(file);
  document.getElementById('reader-title').textContent = file.split('/').pop();
}

marked.setOptions({
  highlight: function (code, lang) {
    if (lang && hljs.getLanguage(lang)) {
      try { return hljs.highlight(code, { language: lang }).value; } catch (e) {}
    }
    return code;
  }
});

fetch(file).then(r => {
  if (!r.ok) throw new Error('加载失败');
  return r.text();
}).then(text => {
  contentEl.innerHTML = marked.parse(text);
  document.title = document.title + ' | ' + file.split('/').pop().replace(/\.md$/, '');
  // 代码高亮
  document.querySelectorAll('pre code').forEach(b => hljs.highlightElement(b));
  // 生成目录
  const tocHtml = [];
  contentEl.querySelectorAll('h1, h2, h3').forEach((h, i) => {
    h.id = 'sec-' + i;
    tocHtml.push(`<a class="lv${h.tagName[1]}" href="#sec-${i}">${h.textContent}</a>`);
  });
  tocEl.innerHTML = '<h4>📑 目录</h4>' + tocHtml.join('');
}).catch(e => {
  contentEl.innerHTML = '<p style="padding:40px;color:#999">笔记加载失败，回首页逛逛吧 → <a href="index.html">首页</a></p>';
});
