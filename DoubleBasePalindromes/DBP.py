#!/usr/bin/env python3

def is_palindrome(n):
    if str(n) == str(n)[::-1]:
        return True

sums = 0
for i in range(10**6):
    if is_palindrome(i):
        # format bin() output '0b111' => '111'
        x = bin(i)[2:]
        if x[0] != 0 and is_palindrome(x):
            sums += i

print(sums)
