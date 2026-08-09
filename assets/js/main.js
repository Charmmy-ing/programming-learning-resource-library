// 编程学习资源库 · 前端逻辑
// 资源统一托管于 GitHub 公共仓库，访客可在线预览 + 一键下载
const GH_RAW = 'https://raw.githubusercontent.com/Charmmy-ing/programming-learning-resource-library/main/';
const GH_DL = 'https://github.com/Charmmy-ing/programming-learning-resource-library/raw/main/';

// 下载按钮通用函数（蓝色）
function dlBtn(file, label) {
  return `<a class="btn btn-primary" href="${GH_DL}${encodeURI(file)}" download>${label}</a>`;
}
// 可点击文件名超链接（点击即下载）
function fileNameLink(file, name) {
  return `<a class="file-link" href="${GH_DL}${encodeURI(file)}" download title="点击下载 ${name}">${name}</a>`;
}
function previewBtn(file, label) {
  return `<a class="btn btn-primary" href="reader.html?file=${encodeURI(file)}">${label}</a>`;
}

// ===== 自学分区 =====
const LANGS = [
  {
    name: '☕ Java 全套', desc: '基础语法 → 面向对象 → 集合/多线程/网络编程',
    readme: 'notes/Java/README.md', src: 'source/Java', count: 250,
    docs: [
      { name: 'JVM 全体系思维导图（3.4万字）', file: 'notes/Java/javanote（running in JVM）.xmind' },
      { name: 'JVM 思维导图结构化文档', file: 'notes/Java/javanote（running in JVM）-结构化优化版.md' },
      { name: 'Java 基础语法整理', file: 'notes/Java/Java学习笔记-整理版.md' },
      { name: '算法基础导图', file: 'notes/Java/算法基础.md' }
    ]
  },
  {
    name: '🔵 C 语言', desc: '语法 → 数据结构 → 算法刷题',
    readme: 'notes/C语言/README.md', src: 'source/C', count: 62,
    docs: [
      { name: '数据结构笔记（栈/队列/树/链表）', file: 'notes/C语言/数据结构/README.md' },
      { name: '计算机导论课程资料', file: 'notes/C语言/计算机导论/README.md' }
    ]
  },
  {
    name: '🟣 C++', desc: '基础语法 + 程序设计 + 排序算法',
    readme: 'notes/C++/README.md', src: 'source/C++', count: 76,
    docs: [
      { name: 'C++ 练习索引', file: 'notes/C++/README.md' }
    ]
  },
  {
    name: '🌐 Web 前端', desc: 'HTML/CSS/JS/Vue 学习记录',
    readme: 'notes/Web前端/README.md', src: null, count: null,
    docs: [
      { name: 'Web 前端学习索引', file: 'notes/Web前端/README.md' }
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
        ${l.docs.map(d => `<div class="doc-item">${fileNameLink(d.file, d.name)}
          <span class="doc-actions">${previewBtn(d.file, '预览')}${dlBtn(d.file, '下载')}</span></div>`).join('')}
      </div>
      ${l.src ? `<p style="margin-top:10px;"><a class="btn" href="${GH_DL}${l.src}/" target="_blank">浏览全部源码</a></p>` : ''}
    </div>`).join('');
}

// ===== 学习方法 =====
function renderNotes() {
  const items = [
    { name: '学习方法论', desc: '笔记先行 · 每日一练 · 结构化归档', file: 'notes/方法论/学习方法论.md' }
  ];
  document.getElementById('method-cards').innerHTML = items.map(i => `
    <div class="card"><h3>${i.name}</h3><p>${i.desc}</p>
      <div class="doc-actions">${previewBtn(i.file, '在线预览')}${dlBtn(i.file, '下载')}</div>
    </div>`).join('');
}

// ===== 编辑必备工具 =====
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
    <a class="btn" href="${t.url}" target="_blank">官网下载</a></div>`).join('');
}

// ===== 自学宝藏网站（精简核心站点） =====
function renderResources(data) {
  const groups = [
    { key: 'java', label: '☕ Java' },
    { key: 'c', label: '🔵 C / C++' },
    { key: 'web', label: '🌐 Web 前端' }
  ];
  const merge = [...data.java.slice(0, 5), ...data.cpp.slice(0, 3)];
  document.getElementById('resource-groups').innerHTML = [
    `<div class="res-group"><h3>🔵 C / C++</h3><ul>
      ${merge.map(r => `<li><a href="${r.url}" target="_blank">${r.name}</a><div class="desc">${r.desc}</div></li>`).join('')}
    </ul></div>`,
    `<div class="res-group"><h3>☕ Java</h3><ul>
      ${data.java.map(r => `<li><a href="${r.url}" target="_blank">${r.name}</a><div class="desc">${r.desc}</div></li>`).join('')}
    </ul></div>`,
    `<div class="res-group"><h3>🌐 Web 前端</h3><ul>
      ${data.web.map(r => `<li><a href="${r.url}" target="_blank">${r.name}</a><div class="desc">${r.desc}</div></li>`).join('')}
    </ul></div>`
  ].join('');
}

// ===== 使用声明 =====
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

// 滚动渐入动效
const io = new IntersectionObserver(entries => {
  entries.forEach(e => {
    if (e.isIntersecting) { e.target.classList.add('show'); io.unobserve(e.target); }
  });
}, { threshold: 0.08 });
document.querySelectorAll('.card, .lang-card').forEach(el => io.observe(el));
