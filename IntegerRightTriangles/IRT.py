#!/usr/bin/env python3

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
