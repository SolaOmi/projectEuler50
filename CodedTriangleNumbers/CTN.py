#!/usr/bin/env python3
"""
Project Euler # 42

"""

import re

t_numbers = [(i**2 + i)//2 for i in range(1,100)]

text = open('pe42.txt')
textContent = text.read()

wordRegex = re.compile(r'[A-Z]+')
words = wordRegex.findall(textContent)

count = 0

for word in words:
    if sum(ord(letter) - 64 for letter in word) in t_numbers:
        count += 1

print(count)
