#!/usr/bin/env python3

"""
Project Euler # 49

"""

from sympy import isprime

primes = [i for i in range(1000, 10000) if isprime(i)]

for i in primes:
    for j in primes:
        if i < j and sorted(str(i)) == sorted(str(j)):
            k = j + (j - i)
            if k in primes and sorted(str(k)) == sorted(str(i)):
                print(i, j, k)
