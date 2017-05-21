#!/usr/bin/env python3

"""
Project Euler # 44

"""

from math import sqrt

def is_pentagonal(n):
    x = (sqrt(24*n + 1) + 1)/6
    if (x).is_integer():
        return True
    else:
        return False

def pentagonal(n):
    return int(n*(3*n -1)/2)

n = 2
switch = True

while switch:
    n += 1
    p_k = pentagonal(n)

    for i in reversed(range(1, n-1)):
        p_j = pentagonal(i)
        if (is_pentagonal(p_k-p_j) and is_pentagonal(p_k+p_j)):
            print((n,p_k), (i,p_j), (p_k - p_j))
            switch = False
            break
