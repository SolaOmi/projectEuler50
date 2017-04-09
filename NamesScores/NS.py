#!/usr/bin/env python3

import re

text = open('pe22.txt')
textContent = text.read()

nameRegex = re.compile(r'[A-Z]+')
names = sorted(nameRegex.findall(textContent))

total = 0

for i in range(len(names)):
    for letter in names[i]:
        total += (i+1) * (ord(letter) - 64)
        # ord() finds unicode numerical value of letter i.e. "A = 65", "B = 66"

print(total)
