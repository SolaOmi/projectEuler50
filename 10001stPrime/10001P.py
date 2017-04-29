#!/usr/bin/env python3

"""
Project Euler # 7

Brute Force
"""

from sympy import isprime

x, count = 3, 1

while count != 10001:
    if isprime(x):
        count += 1
        prime = x
    x += 2

print(prime)
