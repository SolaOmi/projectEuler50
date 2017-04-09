#!/usr/bin/env python3

from fractions import gcd
from functools import reduce

# You can find the lowest common multiple of two numbers using:
# lcm(a,b) = |a*b| / gcd(a,b)
# lcm's Associative law lcm(a,lcm(b,c)) = lcm(lcm(a,b),c) allows us to apply the
# formula to a collection of numbers.

print(reduce((lambda a, b: (a*b)//gcd(a,b)), range(1,21)))
