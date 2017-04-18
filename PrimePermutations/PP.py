#!/usr/bin/env python3

from sympy import isprime
from itertools import permutations

primes = [i for i in range(1000, 10000) if isprime(i)]
