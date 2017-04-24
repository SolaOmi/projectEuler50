#!/usr/bin/env python3

"""
Project Euler # 10

Use an efficient algorithm to generate prime numbers quickly. The sieve
function below is based on the Sieve of Eratosthenes.
"""
from math import sqrt

def sieve(n):
    x = [False, False] + [True] * (n-2)

    for i in range(2, int(sqrt(n))+1):
        if x[i] is True:
            for j in range(i*2, n, i):
                x[j] = False

    return x

x  = sieve((2*10**6)-1)

print(sum(i for i in range(len(x)) if x[i] == True))
