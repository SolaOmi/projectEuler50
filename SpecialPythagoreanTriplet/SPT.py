#!/usr/bin/env python3

"""
Project Euler # 9

Euclid's formula for generating Pythagorean triples given an arbitrary
pair of integers m and n such that m > n > 0.
            a = m**2 - n**2, b = 2*m*n, c = m**2 + n**2
"""

for n in range(1, 1000):
    for m in range(n+1, 1000):
        if 2*m**2 + 2*m*n == 1000:
            a = m**2 - n**2
            b = 2*m*n
            c = m**2 + n**2
            print(a ,b ,c ,a*b*c)
