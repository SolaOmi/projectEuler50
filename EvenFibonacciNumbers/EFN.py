#!/usr/bin/env python3

"""
Project Euler # 2

Brute Force
"""

a = 1
b = 2
total = 0


while b < 4000000:
    a, b = b, a+b
    if a % 2 == 0:
        total += a

print(total)
