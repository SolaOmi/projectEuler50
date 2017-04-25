#!/usr/bin/env python3
"""
Project Euler # 14

"""
x = {1:1, 2: 2, 3: 8, 4: 3, 5: 6, 6: 9, 7: 17, 8: 4, 9: 20, 10: 7}

limit, max_key, max_value = 10**6, 0, 0

for i in range(11, limit+1):
    n, count = i, 0
    while n != 1:
        if n in x:
            count += x[n]
            break
        elif n % 2 == 0:
            n = n / 2
            count += 1
        else:
            n = 3*n + 1
            count += 1

    x[i] = count
    if x[i] > max_value:
        max_value = x[i]
        max_key = i

print(max_key, max_value)
