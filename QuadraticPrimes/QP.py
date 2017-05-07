#!/usr/bin/env python3

"""
Project Euler # 27

Brute Force
"""

import sympy

maxp, i, j = 0, 0, 0
for a in range(-999,1000):
    for b in range(-1000, 1001):
        n = 0
        while sympy.isprime((n**2) + a*n + b):
            n += 1

        if n > maxp:
            maxp = n
            i = a
            j = b

print(maxp, i, j, i*j)
