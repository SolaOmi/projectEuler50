#!/usr/bin/env python3

"""
Project Euler # 1

Using the boolean operator OR will capture the numbers that are
exclusively multiples of 3 and 5 in addition to numbers that are
multiples of both.
"""

print(sum(i for i in range(0, 1000) if i % 3 == 0 or i % 5 == 0))
