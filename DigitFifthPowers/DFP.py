#!/usr/bin/env python3

"""
Project Euler # 30

The number of digits of the sum must equal the number of digits for the
original number
 digits(n)      maximum n      n * 9**5
     5             99,999      295,245
     6            999,999      354,294
     7          9,999,999      413,343     too many digits
"""

sums = 0
for i in range(2, 354294):
    x = 0
    for j in str(i):
        x += int(j)**5
    if i == x:
        sums += i

print(sums)
