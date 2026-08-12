// 编程学习资源库 · 前端逻辑
// 资源统一托管于 GitHub 公共仓库，访客可在线预览 + 一键下载
const GH_RAW = 'https://raw.githubusercontent.com/Charmmy-ing/programming-learning-resource-library/main/';
const GH_DL = 'https://github.com/Charmmy-ing/programming-learning-resource-library/raw/main/';

// 下载按钮（蓝色）
function dlBtn(file, label) {
  return `<a class="btn btn-primary" href="${GH_DL}${encodeURI(file)}" download>${label}</a>`;
}
// 可点击文件名（点击即下载）
function fileNameLink(file, name) {
  return `<a class="file-link" href="${GH_DL}${encodeURI(file)}" download title="点击下载 ${name}">${name}</a>`;
}
// 在线预览按钮（仅限 md 文档）
function previewBtn(file, label) {
  return `<a class="btn" href="reader.html?file=${encodeURI(file)}">${label}</a>`;
}
// 图片预览链接（xmind 预览图）
function imgPreviewBtn(file, label) {
  return `<a class="btn" href="${GH_RAW}${encodeURI(file)}" target="_blank">${label}</a>`;
}

// 自学分区
const LANGS = [
  {
    name: '☕ Java 全套', desc: '基础语法 → 面向对象 → 集合/多线程/网络编程',
    src: 'source/Java', count: 250,
    docs: [
      { name: 'JVM 全体系思维导图（3.4万字）', file: 'notes/Java/javanote（running in JVM）.xmind', type: 'xmind', preview: 'notes/Java/javanote（running in JVM）-预览.png' },
      { name: 'JVM 思维导图结构化文档', file: 'notes/Java/javanote（running in JVM）-结构化优化版.md', type: 'md' },
      { name: 'Java 基础语法整理', file: 'notes/Java/Java学习笔记-整理版.md', type: 'md' },
      { name: '算法基础导图', file: 'notes/Java/算法基础.md', type: 'md' },
      { name: '字面量学习笔记', file: 'notes/Java/字面量.md', type: 'md' }
    ]
  },
  {
    name: '🔵 C 语言', desc: '语法 → 数据结构 → 算法刷题',
    src: 'source/C', count: 62,
    docs: [
      { name: '数据结构笔记（栈/队列/树/链表）', file: 'notes/C语言/数据结构/README.md', type: 'md' },
      { name: '计算机导论课程资料', file: 'notes/C语言/计算机导论/README.md', type: 'md' }
    ]
  },
  {
    name: '🟣 C++', desc: '基础语法 + 程序设计 + 排序算法',
    src: 'source/C++', count: 76,
    docs: [
      { name: 'C++ 练习索引', file: 'notes/C++/README.md', type: 'md' }
    ]
  },
  {
    name: '🌐 Web 前端', desc: 'HTML/CSS/JS/Vue 学习记录',
    src: null, count: null,
    docs: [
      { name: 'Web 前端学习索引', file: 'notes/Web前端/README.md', type: 'md' }
    ]
  }
];

function renderLangCards() {
  document.getElementById('lang-cards').innerHTML = LANGS.map(l => `
    <div class="lang-card">
      <h3>${l.name}</h3>
      <p>${l.desc}</p>
      <p style="font-size:12px;color:#bbb;margin:8px 0;">${l.count ? '收录源码 ' + l.count + ' 个' : ''}</p>
      <div class="doc-list">
        ${l.docs.map(d => {
          const actions = [];
          if (d.type === 'md') actions.push(previewBtn(d.file, '在线预览'));
          if (d.type === 'xmind' && d.preview) actions.push(imgPreviewBtn(d.preview, '查看预览图'));
          actions.push(dlBtn(d.file, '下载'));
          const tip = d.type === 'xmind' ? '<div class="doc-tip">请下载 .xmind 源文件，使用 XMind 客户端打开查看完整思维导图</div>' : '';
          return `<div class="doc-item">${fileNameLink(d.file, d.name)}
            <span class="doc-actions">${actions.join('')}</span>${tip}</div>`;
        }).join('')}
      </div>
      ${l.src ? `<p style="margin-top:10px;"><a class="btn" href="${GH_DL}${l.src}/" target="_blank">浏览全部源码</a></p>` : ''}
    </div>`).join('');
}

// 学习方法
function renderNotes() {
  const items = [
    { name: '学习方法论', desc: '笔记先行 · 每日一练 · 结构化归档', file: 'notes/方法论/学习方法论.md' },
    { name: '后端学习路线导图', desc: '后端方向学习规划（XMind）', file: 'notes/方法论/后端学习路线.xmind', type: 'xmind', preview: 'notes/方法论/后端学习路线-预览.png' }
  ];
  document.getElementById('method-cards').innerHTML = items.map(i => {
    const actions = [];
    if (i.type === 'md' || !i.type) actions.push(previewBtn(i.file, '在线预览'));
    if (i.type === 'xmind' && i.preview) actions.push(imgPreviewBtn(i.preview, '查看预览图'));
    actions.push(dlBtn(i.file, '下载'));
    const tip = i.type === 'xmind' ? '<div class="doc-tip">请下载 .xmind 源文件，使用 XMind 客户端打开查看完整思维导图</div>' : '';
    return `<div class="card"><h3>${i.name}</h3><p>${i.desc}</p>
      <div class="doc-actions" style="margin-top:10px;">${actions.join('')}</div>${tip}</div>`;
  }).join('');
}

// 工具
function renderTools() {
  const tools = [
    { name: 'Visual Studio Code', desc: '开源轻量编辑器，全语言支持', url: 'https://code.visualstudio.com/' },
    { name: 'IntelliJ IDEA 社区版', desc: 'Java 开发主流 IDE（免费）', url: 'https://www.jetbrains.com/idea/download/' },
    { name: 'Visual Studio Community', desc: 'C/C++ 全功能 IDE（免费）', url: 'https://visualstudio.microsoft.com/' },
    { name: 'Git', desc: '版本控制标准工具', url: 'https://git-scm.com/' },
    { name: 'XMind', desc: '思维导图工具', url: 'https://xmind.cn/' },
    { name: 'Node.js', desc: 'JavaScript 运行时环境', url: 'https://nodejs.org/' }
  ];
  document.getElementById('tools-cards').innerHTML = tools.map(t => `
    <div class="card"><h3>${t.name}</h3><p>${t.desc}</p>
    <a class="btn btn-primary" href="${t.url}" target="_blank">官网下载</a></div>`).join('');
}

// 宝藏网站
function renderResources(data) {
  const c = data.c.slice(0, 5);
  const cpp = data.cpp.slice(0, 3);
  const java = data.java.slice(0, 6);
  const web = data.web.slice(0, 5);
  document.getElementById('resource-groups').innerHTML = [
    `<div class="res-group"><h3>🔵 C / C++</h3><ul>
      ${[...c, ...cpp].map(r => `<li><a href="${r.url}" target="_blank">${r.name}</a><div class="desc">${r.desc}</div></li>`).join('')}
    </ul></div>`,
    `<div class="res-group"><h3>☕ Java</h3><ul>
      ${java.map(r => `<li><a href="${r.url}" target="_blank">${r.name}</a><div class="desc">${r.desc}</div></li>`).join('')}
    </ul></div>`,
    `<div class="res-group"><h3>🌐 Web 前端</h3><ul>
      ${web.map(r => `<li><a href="${r.url}" target="_blank">${r.name}</a><div class="desc">${r.desc}</div></li>`).join('')}
    </ul></div>`
  ].join('');
}

// 声明
function renderDisclaimer() {
  document.getElementById('disclaimer-content').innerHTML = `
    <p>本站为在校学生整理分享的编程学习资源库，所有资料开源免费，供广大学习者参考使用。</p>
    <p style="margin-top:8px;">资料仅供学习交流，<strong>禁止任何形式的商用与倒卖</strong>。</p>`;
}

fetch('assets/resources.json').then(r => r.json()).then(renderResources)
  .catch(() => { document.getElementById('resource-groups').innerHTML = '<p>资源加载失败，请稍后刷新重试</p>'; });

renderLangCards();
renderNotes();
renderTools();
renderDisclaimer();

// 滚动渐入
const io = new IntersectionObserver(entries => {
  entries.forEach(e => {
    if (e.isIntersecting) { e.target.classList.add('show'); io.unobserve(e.target); }
  });
}, { threshold: 0.08 });
document.querySelectorAll('.card, .lang-card').forEach(el => io.observe(el));

// 全站搜索：过滤宝藏网站 + 文档列表
const searchInput = document.getElementById('site-search');
const searchCount = document.getElementById('search-count');

function applyFilter(kw) {
  kw = kw.trim().toLowerCase();
  let hit = 0;
  // 宝藏网站条目
  document.querySelectorAll('.res-group').forEach(g => {
    let gHit = 0;
    g.querySelectorAll('li').forEach(li => {
      const show = !kw || li.textContent.toLowerCase().includes(kw);
      li.style.display = show ? '' : 'none';
      if (show) gHit++;
    });
    g.style.display = gHit ? '' : 'none';
    hit += gHit;
  });
  // 自学分区文档条目
  document.querySelectorAll('.lang-card').forEach(card => {
    let cHit = 0;
    card.querySelectorAll('.doc-item').forEach(item => {
      const show = !kw || item.textContent.toLowerCase().includes(kw);
      item.style.display = show ? '' : 'none';
      if (show) cHit++;
    });
    card.style.display = cHit ? '' : 'none';
    hit += cHit;
  });
  // 方法 + 工具卡片
  document.querySelectorAll('#method .card, #tools .card').forEach(card => {
    const show = !kw || card.textContent.toLowerCase().includes(kw);
    card.style.display = show ? '' : 'none';
    if (show) hit++;
  });
  searchCount.textContent = kw ? `找到 ${hit} 条` : '';
  const none = document.getElementById('search-empty');
  if (none) none.style.display = (kw && hit === 0) ? '' : 'none';
}
searchInput.addEventListener('input', () => applyFilter(searchInput.value));

// 回到顶部
const backTop = document.getElementById('back-top');
window.addEventListener('scroll', () => {
  backTop.classList.toggle('show', window.scrollY > 400);
}, { passive: true });
backTop.addEventListener('click', () => window.scrollTo({ top: 0, behavior: 'smooth' }));
