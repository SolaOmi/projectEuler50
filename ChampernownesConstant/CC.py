#!/usr/bin/env python3

x = ''.join((list(str(i) for i in range(1, 1+10**6))))
a = int(x[0])
b = int(x[9])
c = int(x[99])
d = int(x[999])
e = int(x[9999])
f = int(x[99999])
g = int(x[999999])
print(a*b*c*d*e*f*g)
