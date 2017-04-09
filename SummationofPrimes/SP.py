#!/usr/bin/env python3

from math import sqrt

def sieve(n): # Sieve of Eratosthenes will produce True for Prime numbers
    x = [False, False] + [True] * (n-2)

    for i in range(2, int(sqrt(n))+1):
        if x[i] is True:
            for j in range(i*2, n, i):
                x[j] = False

    return x

x  = sieve((2*10**6)-1)

print(sum(i for i,j in enumerate(x, 0) if j is True))
