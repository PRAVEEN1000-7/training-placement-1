# QUESTION:
# Given a square matrix, find and print its determinant rounded to 2 decimal places.

import numpy as np

n = int(input())
arr = np.array([list(map(float, input().split())) for _ in range(n)])

print(round(np.linalg.det(arr), 2))
