#!/usr/bin/env python3

text = open('pe13.txt')
textContent = text.readlines()

# The numbers are so big that only adding the first 12 digits of the 50
# doesn't affect the accuracy of the sum's first ten digits.
print(sum(int(i[0:12]) for i in textContent))
