#!/usr/bin/env python3
# 链接体检：并发实测外部链接 HTTP 状态，标记死链
import json, re, subprocess, concurrent.futures as cf

UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36'
PROXY = 'http://127.0.0.1:7890'

def check(url):
    try:
        out = subprocess.run(['curl', '-s', '-o', '/dev/null', '-w', '%{http_code}', '-L',
                              '--max-time', '20', '-A', UA, '--proxy', PROXY, url],
                             capture_output=True, text=True, timeout=30)
        return url, out.stdout.strip()
    except Exception as e:
        return url, 'ERR'

def main():
    data = json.load(open('assets/resources.json'))
    urls = set()
    src = {}
    for cat, items in data.items():
        for it in items:
            urls.add(it['url']); src[it['url']] = (cat, it['name'])
    # main.js 工具站
    mainjs = open('assets/js/main.js', encoding='utf-8').read()
    for m in re.findall(r"url: '([^']+)'", mainjs):
        urls.add(m)
    urls = sorted(urls)
    print(f'共 {len(urls)} 个外部链接，开始并发检测...')
    results = {}
    with cf.ThreadPoolExecutor(max_workers=10) as ex:
        for u, code in ex.map(check, urls):
            results[u] = code
    print('\n--- 结果 ---')
    for u in urls:
        tag = 'OK ' if results[u] in ('200', '301', '302', '403') else 'DEAD'
        print(f'{tag} {results[u]:>4}  {u}')

if __name__ == '__main__':
    main()
