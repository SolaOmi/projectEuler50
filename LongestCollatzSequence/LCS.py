#!/usr/bin/env python3

x = {2: 2, 3: 8, 4: 3, 5: 6, 6: 9, 7: 17, 8: 4, 9: 20, 10: 7} #number:collatz chain length

limit, a, b = 10**6, 0, 0 # a,b (key of max value, max value)

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
    if x[i] > b:
        b = x[i]
        a = i

print(a, b)
