#!/usr/bin/env python3

from sympy import isprime

prime_sums = [0]
n, lim = 0, 10**6

for i in range(lim):
    if isprime(i) and prime_sums[-1] < lim:
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
