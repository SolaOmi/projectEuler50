#!/usr/bin/env python3

import re

text = open('pe11.txt')
textContent = text.readlines()
numRegex = re.compile(r'[0-9]+')

g = []
for i in textContent:
    mo = numRegex.findall(i)
    g.append(mo)

Max = 0

for i in range(0,20):
    for j in range(0, 17): # left/right
         l = int(g[i][j])*int(g[i][j+1])*int(g[i][j+2])*int(g[i][j+3])
         if l > Max:
             Max = l
    for j in range(0, 20): # up/down
        if i < 17:
             d =  int(g[i][j])*int(g[i+1][j])*int(g[i+2][j])*int(g[i+3][j])
             if d > Max:
                 Max = d
    for j in range(3, 17): # diagonals
        if i > 2 and i < 17:
            nw = int(g[i][j])*int(g[i-1][j-1])*int(g[i-2][j-2])*int(g[i-3][j-3])
            ne = int(g[i][j])*int(g[i-1][j+1])*int(g[i-2][j+2])*int(g[i-3][j+3])
            sw = int(g[i][j])*int(g[i+1][j-1])*int(g[i+2][j-2])*int(g[i+3][j-3])
            se = int(g[i][j])*int(g[i+1][j+1])*int(g[i+2][j+2])*int(g[i+3][j+3])
            di = max(nw, ne, sw, se)
            if di > Max:
                Max = di
print(Max)
