#!/usr/bin/env python3

from sympy import isprime

n = 600851475143
primes = list(i for i in range(3, 10000, 2) if isprime(i))

while n > 1:
    for i in primes:
        if n % i == 0:
            n = n / i
            print(i)
            break
