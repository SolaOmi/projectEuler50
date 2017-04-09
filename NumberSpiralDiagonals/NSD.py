#!/usr/bin/env python3

# f(n) = 4n**2 + bn + c
# Ulam spiral, derived constants with simultaneous eqns. f(1) = 9, f(2) = 25
# f(n) = 4n**2 + 4n + 1
# 1001 x 1001, n = 500

def spiral(n):
    return 4*n**2 + 4*n + 1

# spiral gives northwest diagonal
# spiral - 2i gives northeast diagonal
# spiral - 4i gives southeast diagonal
# spiral - 6i gives southwest diagonal 

print(sum(4*spiral(i) - 12*i for i in range(1, 501)) + 1)
# +1 for center of diagonal lines
