#!/bin/python3

import sys


def func(num):
    return num[2:]
        
n = int(input().strip())
a = max(func(bin(n)).split('0')).count('1')
print(a)
