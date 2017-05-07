#!/usr/bin/env python3

"""
Project Euler # 31

Dynamic Programming
"""

lim = 200
coins = [1, 2, 5, 10, 20, 50, 100, 200]
ways = [0]*201
ways[0] = 1

for i in coins:
    for j in range(i, lim+1):
            ways[j] += ways[j-i]

print(ways[lim])
