#!/usr/bin/env python3

import math

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

def is_amicable(a):
    b = sum(factors(a))
    if a != b and a == sum(factors(b)):
        return True

print(sum(i for i in range(10001) if is_amicable(i)))
