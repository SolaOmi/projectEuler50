#!/usr/bin/env python3

"""
Project Euler # 38

"""

x = [str(i) for i in range(1,10)]

for i in range(9123, 9876):
    y = str(i) + str(2*i)
    if x == sorted(y):
        print(i, y)
