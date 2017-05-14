#!/usr/bin/env python3
"""
Project Euler # 34

"""

from math import factorial as f

lim = 7*f(9) # 9,999,999 and 7*9! same order of digits
sums = 0

def digit_factorial_sum(n):
    return sum(f(int(i)) for i in str(n))

for i in range(10, lim+1):
    if i == digit_factorial_sum(i):
        print(i)
        sums += i

print(sums)
