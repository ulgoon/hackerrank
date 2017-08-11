#!/bin/python3

import sys


arr = []
for arr_i in range(6):
    arr_t = [int(arr_temp) for arr_temp in input().strip().split(' ')]
    arr.append(arr_t)

result = -9 * 36

for i in range(4):
    for j in range(4):
        hourglass = arr[i][j:j+3] + arr[i+2][j:j+3]
        hourglass.append(arr[i+1][j+1])
                                              
        sum_temp = sum(hourglass)
                                                              
        if sum_temp > result:
            result = sum_temp

print(result)
