#!/usr/bin/env python3

"""
Project Euler # 39

a**2 + b**2 = c**2
a + b + c = p
substitution yields b = (p*(p-2*i)/(2*(p-i))
b is an integer, meaning the modulus of the equation of b must equal zero
"""

pmax_solutions, n = 0, 0

for p in range(2, 1000):
    p_solutions = 0
    for i in range(2, 1000):
        if i < p and (p*(p-2*i) % (2*(p-i)) == 0):
            p_solutions += 1
    if p_solutions > pmax_solutions:
        pmax_solutions = p_solutions
        n = p

print(n)
