// 极简原生JS：加载资源数据并渲染
const SECTIONS = [
  { id: 'method-cards', type: 'notes', dir: 'notes/方法论' },
  { id: 'lang-cards', type: 'lang' },
  { id: 'tools-cards', type: 'tools' }
];

const LANGS = [
  { name: '☕ Java', desc: '基础语法 → 面向对象 → 实战练习', notes: 'notes/Java', src: 'source/Java', count: 250 },
  { name: '🔵 C 语言', desc: '语法基础 → 数据结构 → 算法练习', notes: 'notes/C语言', src: 'source/C', count: 62 },
  { name: '🟣 C++', desc: '基础语法 → 程序设计与排序算法', notes: 'notes/C++', src: 'source/C++', count: 76 },
  { name: '🌐 Web 前端', desc: 'HTML/CSS/JS/Vue 入门练习', notes: 'notes/Web前端', src: null, count: null }
];

function renderLangCards() {
  const el = document.getElementById('lang-cards');
  el.innerHTML = LANGS.map(l => `
    <div class="lang-card">
      <h3>${l.name}</h3>
      <p>${l.desc}</p>
      <p style="font-size:12px;color:#999;margin-top:6px;">${l.count ? '源码副本 ' + l.count + ' 个' : ''}</p>
      ${l.notes ? `<a href="${l.notes}/">笔记副本</a>` : ''}
      ${l.src ? `<a href="${l.src}/" style="margin-left:10px;">源码副本</a>` : ''}
    </div>`).join('');
}

function renderNotes() {
  const el = document.getElementById('method-cards');
  const items = [
    { name: '个人学习方法论', desc: '笔记先行、每日一练、结构化归档', file: 'notes/方法论/学习方法论.md' },
    { name: '资料版本说明', desc: '本地原版与线上优化副本版本独立', file: 'notes/方法论/资料版本说明.md' }
  ];
  el.innerHTML = items.map(i => `
    <div class="card"><h3>${i.name}</h3><p>${i.desc}</p>
    <a href="${i.file}" target="_blank">查看 →</a></div>`).join('');
}

function renderTools() {
  const el = document.getElementById('tools-cards');
  const tools = [
    { name: 'Visual Studio Code', desc: '免费开源轻量编辑器，支持全语言', url: 'https://code.visualstudio.com/' },
    { name: 'IntelliJ IDEA Community', desc: 'JetBrains 免费社区版 Java IDE', url: 'https://www.jetbrains.com/idea/download/' },
    { name: 'Visual Studio Community', desc: '微软免费 C/C++ IDE', url: 'https://visualstudio.microsoft.com/' },
    { name: 'Git + GitHub', desc: '版本控制与代码托管', url: 'https://git-scm.com/' }
  ];
  el.innerHTML = tools.map(t => `
    <div class="card"><h3>${t.name}</h3><p>${t.desc}</p>
    <a href="${t.url}" target="_blank">官网下载 →</a></div>`).join('');
}

function renderResources(data) {
  const groups = [
    { key: 'c', label: '🔵 C 语言学习资源' },
    { key: 'cpp', label: '🟣 C++ 学习资源' },
    { key: 'java', label: '☕ Java 学习资源' },
    { key: 'web', label: '🌐 Web 前端学习资源' }
  ];
  const el = document.getElementById('resource-groups');
  el.innerHTML = groups.map(g => `
    <div class="res-group"><h3>${g.label}</h3><ul>
      ${data[g.key].map(r => `<li><a href="${r.url}" target="_blank">${r.name}</a>
      <div class="desc">${r.desc}</div></li>`).join('')}
    </ul></div>`).join('');
}

function renderVersion() {
  document.getElementById('version-content').innerHTML = `
    <div class="card">
      <p><strong>本站所有优化版资料均为本地原件的整理副本。</strong></p>
      <p style="margin-top:8px;">优化仅做：错别字修正、排版结构梳理、条目化整理，不篡改原知识点与个人感悟。</p>
      <p style="margin-top:8px;">📁 电脑本地永久留存原版原始文件（只读封存）· 🌐 GitHub 本站为优化副本（独立版本）</p>
    </div>`;
}

// 加载资源JSON
fetch('assets/resources.json').then(r => r.json()).then(data => {
  renderResources(data);
}).catch(() => {
  document.getElementById('resource-groups').innerHTML = '<p>资源加载失败</p>';
});

renderLangCards();
renderNotes();
renderTools();
renderVersion();
