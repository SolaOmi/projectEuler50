#!/usr/bin/env python3

"""
Project Euler # 47

"""

import math
from sympy import isprime

def pfc(n):
    # prime_factors_count (pfc) - counts the amount of prime factors.
    count = 0
    if n == 1:
        return count

    for i in range(2, int(math.sqrt(n)+1)):
        if n % i == 0:
            if i*i == n and isprime(i):
                count += 1
            else:
                if isprime(i):
                    count += 1
                if isprime(n // i):
                    count += 1
    return count

n = 0
while True:
    if pfc(n) >= 4 and pfc(n+1) >= 4 and pfc(n+2) >= 4 and pfc(n+3) >= 4:
        break
    else:
        n += 1

print(n, n+1, n+2, n+3)
