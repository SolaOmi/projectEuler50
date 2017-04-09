#!/usr/bin/env python3

lat = [] # Lattice node values

for i in range(1, 42): # Loop creates Pascal's Triangle for a 20 x 20 square.
    lat.append([1]*i)

for i in range(1, len(lat)): # Start from the second row (index 1).
    for j in range(0, len(lat[i])):
        # All the edge nodes have a value of 1.
        if j == 0 or j == len(lat[i]) - 1:
             lat[i][j] = 1
        # All other nodes have a value of the two nodes above it combined
        else:
            lat[i][j] = lat[i-1][j-1] + lat[i-1][j]


print(max(lat[-1])) # The max of the last row gives the amount of path ways.
