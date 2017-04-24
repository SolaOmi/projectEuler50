#!/usr/bin/env python3

"""
Project Euler # 3

The fundamental theorem of arithmetic states that every integer greater
than 1 is either prime or is the product of prime nbers (factors).
Symbolic python (Sympy) contains a method that checks for primality.
Generate a list of prime nbers and loop through them checking if they
are factors of (n), if so break and repeat the process until n = 1.
"""

from sympy import isprime

n = 600851475143
primes = list(i for i in range(3, 10000, 2) if isprime(i))

while n > 1:
    for i in primes:
        if n % i == 0:
            n = n / i
            print(i)
            break
