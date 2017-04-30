#!/usr/bin/env python3

"""
Project Euler # 23


"""

import math

def factors_sum(n):
    if n == 1:
        return 1

    x = 1
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            if i*i == n:
                x += i
            else:
                x += i + (n // i)
    return x

def is_abundant(n):
    return factors_sum(n) > n

abundants = [i for i in range(1,28124) if is_abundant(i)]

sum_of_an = []
for i in abundants:
    for j in abundants:
        sum_of_an.append(i+j)
        if i + j > 28123:
            break

sum_of_an = set(sum_of_an)
print(sum(i for i in range(28124) if i not in sum_of_an))
