#!/usr/bin/env python3

"""
Project Euler # 25

"""

a,b = 1, 1
count, index = 0, 2

while count < 1000:
    a, b = b, a+b
    index += 1
    count = len(str(b))

print(index)
