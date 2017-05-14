#!/usr/bin/env python3

"""
Project Euler # 40

"""

x = ''.join((list(str(i) for i in range(1, 1+10**6))))
total = 1
for i in range(7):
    total *= int(x[(10**i)-1])
print(total)
