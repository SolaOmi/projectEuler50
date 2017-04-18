#!/usr/bin/env python3

import math
from sympy import isprime

def factors(n):
    if n == 1:
        return [1]

    x = [1]
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            if i*i == n:
                x.append(i)
            else:
                x.append(i)
                x.append(n // i)
    return sorted(x)

n = 0
while True:
    if sum([1 for i in factors(n) if isprime(i)]) >= 4:
        if sum([1 for i in factors(n+1) if isprime(i)]) >= 4:
            if sum([1 for i in factors(n+2) if isprime(i)]) >= 4:
                if sum([1 for i in factors(n+3) if isprime(i)]) >= 4:
                    break
                else: n += 1
            else:
                n += 1
        else:
            n += 1
    else:
        n += 1

print(n, n+1, n+2, n+3)
