#!/usr/bin/env python3

from sympy import isprime
from itertools import permutations

x = list(permutations(['1','2','3','4','5','6','7']))#,'8','9']))
# No primes when the first digit is 8 or 9.

for i in x:
    if isprime(int(''.join(i))):
        largest = int(''.join(i))

print(largest)
