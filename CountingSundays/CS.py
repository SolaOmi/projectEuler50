#!/usr/bin/env python3

"""
Project Euler # 19

Brute Force
"""

from datetime import datetime, timedelta

start = datetime(1901, 1, 1)
end = datetime(2000, 12, 31)
count = 0

while start != end:
    # %d - day of the month (i.e. 1st), %w day of the week (i.e. Sunday)
    if start.strftime('%d') == '01' and start.strftime('%w') == '0':
        count += 1
    start += timedelta(days = 1)

print(count)
