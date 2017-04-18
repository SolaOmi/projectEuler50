#!/usr/bin/env python3

for i in range(10,100):
    for j in range(10, 100):
        if j < i and str(i)[1] != '0':
            if j/i == int(str(j)[0])/int(str(i)[1]) and str(j)[1] == str(i)[0]:
                print(str(j)+"/"+str(i))
        else:
            continue
