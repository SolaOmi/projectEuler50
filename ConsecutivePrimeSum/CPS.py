#!/usr/bin/env python3

"""
Project Euler # 50

"""

from math import sqrt
from sympy import isprime

def sieve(n):
    x = [False, False] + [True] * (n-2)

    for i in range(2, int(sqrt(n))+1):
        if x[i] is True:
            for j in range(i*2, n, i):
                x[j] = False

    return x

prime_sums = [0]
n, lim = 0, 10**6
primes = sieve(lim)

for i in range(len(primes)):
    if primes[i] and prime_sums[-1] < lim:
        n += i
        prime_sums.append(n)

del prime_sums[-1]

x = len(prime_sums)
t = 1
for i in range(x):
	for j in reversed(range(x)):
		n = prime_sums[j] - prime_sums[i]
		if (j-i > t and isprime(n)):
			t, max_prime = j-i, n
			break

print(max_prime)
