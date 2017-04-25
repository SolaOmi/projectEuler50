#!/usr/bin/env python3

"""
Project Euler # 12


"""
import math

def factors(n):
    if n == 1:
        return 1

    count =  2
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            if i*i == n:
                count += 1
            else:
                count += 2
    return count

x, f = 0, 0
while f < 500:
    x += 1
    triangleNumber = (x * (x+1))//2 # Formula for triangle numbers.
    f = factors(triangleNumber)

print(triangleNumber, f)
