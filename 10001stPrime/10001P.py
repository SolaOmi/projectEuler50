#!/usr/bin/env python3

from sympy import isprime

x, count = 3, 1

while count != 10001:
    if isprime(x):
        count += 1
        prime = x
    x += 2

print(prime)
