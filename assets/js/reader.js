// 阅读进度条：跟着滚动走
const prog = document.getElementById('read-progress');
window.addEventListener('scroll', () => {
  const h = document.documentElement;
  const pct = h.scrollHeight > h.clientHeight
    ? (h.scrollTop / (h.scrollHeight - h.clientHeight)) * 100 : 0;
  prog.style.width = pct + '%';
}, { passive: true });

// 笔记阅读器：marked + highlight.js 渲染 + 目录
const params = new URLSearchParams(location.search);
const file = params.get('file');
const contentEl = document.getElementById('content');
const tocEl = document.getElementById('toc');

// 下载按钮走仓库直链
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

// 非 md 文件不做渲染，提示下载
if (!file || !file.toLowerCase().endsWith('.md')) {
  contentEl.innerHTML = '<div style="padding:60px 40px;text-align:center;"><p style="font-size:16px;color:#374151;">该文件不支持在线预览</p><p style="margin-top:10px;color:#9ca3af;font-size:13px;">请下载源文件后使用对应客户端打开查看</p><p style="margin-top:20px;"><a class="btn btn-primary" href="index.html">← 返回首页</a></p></div>';
  document.getElementById('toc').innerHTML = '';
  document.querySelector('.toc').style.display = 'none';
} else {
  loadMarkdown();
}

function loadMarkdown() {
  fetch(file).then(r => {
    if (!r.ok) throw new Error('加载失败');
    return r.text();
  }).then(text => {
    contentEl.innerHTML = marked.parse(text);
    document.title = document.title + ' | ' + file.split('/').pop().replace(/\.md$/, '');
    // 高亮
    document.querySelectorAll('pre code').forEach(b => hljs.highlightElement(b));
    // 目录
    const tocHtml = [];
    contentEl.querySelectorAll('h1, h2, h3').forEach((h, i) => {
      h.id = 'sec-' + i;
      tocHtml.push(`<a class="lv${h.tagName[1]}" href="#sec-${i}">${h.textContent}</a>`);
    });
    tocEl.innerHTML = '<h4>📑 目录</h4>' + tocHtml.join('');
  }).catch(e => {
    contentEl.innerHTML = '<p style="padding:40px;color:#999">文档加载失败，请返回首页后重试</p>';
  });
}
