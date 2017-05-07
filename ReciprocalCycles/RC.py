#!/usr/bin/env python3

"""
Project Euler # 26

"""

import sympy

def max_reptend(lim):
    primes = [i for i in range(lim) if sympy.isprime(i)]
    for p in primes[::-1]:
        for order in range(1, p-1):
            if (10 ** order) % p == 1:
                break
        else:
            return p

print(max_reptend(1000))
