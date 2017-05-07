#!/usr/bin/env python3

"""
Project Euler # 32

Brute Force
"""

x = set()
for i in range(1,100):
    for j in range(10000//i):
        pp = sorted(str(i)+str(j)+str(i*j))
        if pp == list(str(i) for i in range(1,10)):
            x.add(i*j)

print(sum(x))
