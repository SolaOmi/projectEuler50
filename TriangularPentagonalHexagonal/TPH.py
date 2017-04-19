#!/usr/bin/env python3
# All hexagonal numbers are triangular.

from math import sqrt

def is_pentagonal(n):
    x = (sqrt(24*n + 1) + 1)/6
    if (x).is_integer():
        return True
    else:
        return False

def hexagonal(n):
    return n*(2*n - 1)

n = 144

while not is_pentagonal(hexagonal(n)):
    n += 1

print(n, hexagonal(n))
