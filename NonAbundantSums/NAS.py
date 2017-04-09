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

def is_abundant(n):
    if sum(factors(n)) > n:
        return True

abundants = [i for i in range(1,28124) if is_abundant(i)]

sum_of_an = []
for i in abundants:
    for j in abundants:
        sum_of_an.append(i+j)
        if i + j > 28123:
            break

sum_of_an = set(sum_of_an)
print(sum(i for i in range(28124) if i not in sum_of_an))
