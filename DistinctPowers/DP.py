#!/usr/bin/env python3

"""
Project Euler # 29

Brute Force
"""

print(len(set(a**b for a in range(2, 101) for b in range(2, 101))))
