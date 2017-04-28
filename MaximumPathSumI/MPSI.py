#!/usr/bin/env python3

"""
Project Euler # 18

"""

import re

text = open('pe18.txt')
textContent = text.readlines()
numRegex = re.compile(r'[0-9]+')

triangle = []
for i in textContent:
    mo = numRegex.findall(i)
    triangle.append(mo)

triangle = [[int(j) for j in i] for i in triangle]

# Choose the biggest adjacent number from below for each number
# from the 2nd to the last row all the way to the first row.
for i in reversed(range(len(triangle)-1)):
    for j in (range(len(triangle[i]))):
        if triangle[i+1][j] > triangle[i+1][j+1]:
            triangle[i][j] += triangle[i+1][j]
        else:
            triangle[i][j] += triangle[i+1][j+1]

print(triangle[0])
