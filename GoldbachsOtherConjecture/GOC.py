#!/usr/bin/env python3

from sympy import isprime

squares = [i**2 for i in range(1, 100)]
odd_composites = [i for i in range(3, 10000, 2) if not isprime(i)]

for i in odd_composites:
    count = 0
    for j in (j for j in range(i) if isprime(j)):
        if (i-j)/2 in squares:
            count = 1
            break
    if count == 0:
        print(i)
        break
