#!/usr/bin/env python3

import inflect, re

letterRegex = re.compile(r'[a-z]+')
p = inflect.engine()
limit, count = 1000, 0

for i in range(1, limit+1):
    ntw = p. number_to_words(i)
    words = letterRegex.findall(ntw) # Returns a list of words
    for word in words:
        for letter in word:
            count += 1

print(count)
