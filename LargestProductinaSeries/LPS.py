#!/usr/bin/env python3

import re

text = open('pe8.txt', 'r')
textContent = text.read()
numRegex = re.compile(r'[0-9]+')
mo = numRegex.findall(textContent)

x = ''
for i in mo:
    x += i

a , Max = 0, 0

while a < 988:
    b = 1
    for i in x[a:a+13]:
        b *= int(i)
    if b > Max:
        Max = b
    a += 1

print(Max)
