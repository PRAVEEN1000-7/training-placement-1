#!/bin/python3

import math
import os
import random
import re
import sys

def checkweird(n):
    
    if 1<=n<=100:
        if n%2!=0:
            print("Weird")
        else :
            if (2<=n<=5):
                print("Not Weird")
            elif (6<=n<=20) :
                print("Weird")
            else :
                print("Not Weird")
    else:
        None    

if __name__ == '__main__':
    n = int(input().strip()) 
    checkweird(n)

