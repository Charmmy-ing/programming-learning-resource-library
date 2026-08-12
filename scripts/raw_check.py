#!/usr/bin/env python3
# 校验 main.js / reader / notes README 中所有引用文件确实存在于 git 仓库
import re, subprocess
from urllib.parse import unquote

out = subprocess.run(['git', '-c', 'core.quotePath=false', 'ls-tree', '-r', '--name-only', '-z', 'main'],
                     capture_output=True, text=True).stdout
tree = set(out.split('\0'))

problems = []
js = open('assets/js/main.js', encoding='utf-8').read()
for m in re.finditer(r"file: '([^']+)'", js):
    problems.append(('main.js file', m.group(1)))
for m in re.finditer(r"preview: '([^']+)'", js):
    problems.append(('main.js preview', m.group(1)))

readmes = ['notes/Java/README.md', 'notes/C语言/README.md', 'notes/C++/README.md',
           'notes/Web前端/README.md', 'notes/方法论/README.md',
           'notes/C语言/数据结构/README.md', 'notes/C语言/计算机导论/README.md']
for p in readmes:
    try:
        text = open(p, encoding='utf-8').read()
    except FileNotFoundError:
        continue
    base = '/'.join(p.split('/')[:-1])
    for m in re.finditer(r'\]\(([^)#]+)\)', text):
        rel = unquote(m.group(1)).strip()
        if rel.startswith('http') or rel.startswith('#') or rel.startswith('../../'):
            continue
        problems.append((p, base + '/' + rel))

bad = [(src, t) for src, t in problems if t not in tree and t.rstrip('/') not in tree]
print(f'检查 {len(problems)} 个引用，缺失 {len(bad)} 个:')
for src, t in bad:
    print(f'  MISSING: {t}  (from {src})')
if not bad:
    print('  全部存在 ✓')
