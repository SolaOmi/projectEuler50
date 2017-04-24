#!/usr/bin/env python3

"""
Project Euler # 4

Find all the products of two 3-digit numbers; then convert the result to
a string, and test if the string is palindromic by comparing it to its
self reversed. Use the built in max() function to find the largest one.
"""

print(max(list(i*j for i in (range(100, 1000)) for j in(range(100, 1000))
               if str(i*j) == str(i*j)[::-1])))
