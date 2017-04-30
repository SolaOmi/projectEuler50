#!/usr/bin/env python3

"""
Project Euler # 18

Traverse the n from bottom up instead of top down.
"""

import re

text = open('pe18.txt')
textContent = text.readlines()
numRegex = re.compile(r'[0-9]+')

n = []
for i in textContent:
    mo = numRegex.findall(i)
    n.append(mo)

n = [[int(j) for j in i] for i in n]

# Choose the biggest adjacent number from below for each number
# from the 2nd to the last row all the way to the first row.
for i in reversed(range(len(n)-1)):
    for j in range(len(n[i])):
        if n[i+1][j] > n[i+1][j+1]:
            n[i][j] += n[i+1][j]
        else:
            n[i][j] += n[i+1][j+1]

print(n[0])
