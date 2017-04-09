#!/usr/bin/env python3

import sympy

maxp, i, j = 0, 0, 0
for a in range(-999,1000):
    for b in range(-1000, 1001):
        count, n = 0, 0
        while sympy.isprime((n**2) + a*n + b):
            n += 1
            count  += 1
        if count > maxp:
            maxp = count
            i = a
            j = b

print(maxp, i, j, i*j)
