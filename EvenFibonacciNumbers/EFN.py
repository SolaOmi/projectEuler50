#!/usr/bin/env python3

a = 1 
b = 2
sums = 0

while b < 4*10**6:
    a, b = b, a+b
    if a % 2 == 0:
        sums += a

print(sums)
