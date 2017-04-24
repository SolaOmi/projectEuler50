#!/usr/bin/env python3

"""
Project Euler # 2

Using a while loop will run the Fibonacci sequence on the prev and
cur variables unitl cur is greater than 4,000,000. Check evenness using
modulo 2 test.
"""

prev = 1
cur = 2
total = 0
lim = 4*10**6

while cur < lim:
    prev, cur = cur, prev+cur
    if prev % 2 == 0:
        total += prev

print(total)
