// 学生风极简渲染
const LANGS = [
  { name: '☕ Java', desc: '从 HelloWorld 一路卷到面向对象', notes: 'notes/Java', src: 'source/Java', count: 250 },
  { name: '🔵 C 语言', desc: '语法 → 数据结构 → 刷算法', notes: 'notes/C语言', src: 'source/C', count: 62 },
  { name: '🟣 C++', desc: '基础语法 + 排序 + 程序设计作业', notes: 'notes/C++', src: 'source/C++', count: 76 },
  { name: '🌐 Web 前端', desc: 'HTML/CSS/JS/Vue 折腾记录', notes: 'notes/Web前端', src: null, count: null }
];

function renderLangCards() {
  document.getElementById('lang-cards').innerHTML = LANGS.map(l => `
    <div class="lang-card">
      <h3>${l.name}</h3>
      <p>${l.desc}</p>
      <p style="font-size:12px;color:#bbb;margin-top:6px;">${l.count ? '源码副本 ' + l.count + ' 个' : ''}</p>
      ${l.notes ? `<a href="${l.notes}/">笔记</a>` : ''}
      ${l.src ? `<a href="${l.src}/">源码</a>` : ''}
    </div>`).join('');
}

function renderNotes() {
  const items = [
    { name: '个人学习方法论', desc: '笔记先行 · 每日一练 · 结构化归档', file: 'notes/方法论/学习方法论.md' },
    { name: '资料版本说明', desc: '本地原稿 vs 线上副本，双版本独立', file: 'notes/方法论/资料版本说明.md' }
  ];
  document.getElementById('method-cards').innerHTML = items.map(i => `
    <div class="card"><h3>${i.name}</h3><p>${i.desc}</p>
    <a href="reader.html?file=${encodeURIComponent(i.file)}">看看 →</a></div>`).join('');
}

function renderTools() {
  const tools = [
    { name: 'VS Code', desc: '免费轻量，写啥都行', url: 'https://code.visualstudio.com/' },
    { name: 'IntelliJ IDEA 社区版', desc: '写 Java 的快乐老家（免费）', url: 'https://www.jetbrains.com/idea/download/' },
    { name: 'Visual Studio Community', desc: 'C/C++ 作业必备（免费）', url: 'https://visualstudio.microsoft.com/' },
    { name: 'Git + GitHub', desc: '代码存档 + 托管，早晚要会', url: 'https://git-scm.com/' },
    { name: 'XMind', desc: '画思维导图理思路', url: 'https://xmind.cn/' },
    { name: 'Dev-C++', desc: '轻量 C/C++ 小工具', url: 'https://www.bloodshed.net/' }
  ];
  document.getElementById('tools-cards').innerHTML = tools.map(t => `
    <div class="card"><h3>${t.name}</h3><p>${t.desc}</p>
    <a href="${t.url}" target="_blank">下载 →</a></div>`).join('');
}

function renderResources(data) {
  const groups = [
    { key: 'c', label: '🔵 C 语言' },
    { key: 'cpp', label: '🟣 C++' },
    { key: 'java', label: '☕ Java' },
    { key: 'web', label: '🌐 Web 前端' }
  ];
  document.getElementById('resource-groups').innerHTML = groups.map(g => `
    <div class="res-group"><h3>${g.label}</h3><ul>
      ${data[g.key].map(r => `<li><a href="${r.url}" target="_blank">${r.name}</a>
      <div class="desc">${r.desc}</div></li>`).join('')}
    </ul></div>`).join('');
}

function renderVersion() {
  document.getElementById('version-content').innerHTML = `
    <div class="card">
      <p><strong>本站所有优化版资料都是本地原稿的整理副本。</strong></p>
      <p style="margin-top:8px;">优化只做：修错别字、理排版、拆小标题，知识点和个人想法一字不改。</p>
      <p style="margin-top:8px;">📁 电脑本地 = 原稿永久封存（只读）· 🌐 本站 = 优化副本（独立更新）</p>
    </div>`;
}

function renderDisclaimer() {
  document.getElementById('disclaimer-content').innerHTML = `
    <p>本仓库只是俺一个普通在校大学生自学沉淀的资料，无偿开源分享给同学们参考。</p>
    <p style="margin-top:8px;">🙏 仅供自学交流使用，<strong>禁止任何商用倒卖</strong>，一起学习一起进步！</p>`;
}

fetch('assets/resources.json').then(r => r.json()).then(renderResources)
  .catch(() => { document.getElementById('resource-groups').innerHTML = '<p>资源加载失败，稍后再来</p>'; });

renderLangCards();
renderNotes();
renderTools();
renderVersion();
renderDisclaimer();
