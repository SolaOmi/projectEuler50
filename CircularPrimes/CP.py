#!/usr/bin/env python3
"""
Project Euler # 35

"""

from sympy import isprime
from math import sqrt

def sieve(n): # Sieve of Eratosthenes
    x = [False, False] + [True] * (n-2)

    for i in range(2, int(sqrt(n))+1):
        if x[i] is True:
            for j in range(i*2, n, i):
                x[j] = False

    return enumerate(x, 0)

def circular(n): # Finds out if prime is circular
    x = str(n)
    for i in range(1, len(x)):
        a = x[i::] + x[:i:]
        if not isprime(int(a)):
            return False
    return True

print(sum(1 for i, j in sieve(10**6) if j and circular(i)))
