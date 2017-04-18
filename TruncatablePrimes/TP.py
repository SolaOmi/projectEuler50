#!/usr/bin/env python3

from sympy import isprime

def trunc_primes(p):
    length = len(str(p))

    for i in range(1, length):
        if not isprime(int(str(p)[i:])): #L-R
            return False
        if not isprime(int(str(p)[:length-i])): #R-L
            return False

    return True

n, sums, count = 11, 0, 0

while count != 11:
    if isprime(n) and trunc_primes(n):
        sums += n
        count += 1
        n += 2
    else:
        n += 2

print(sums)
