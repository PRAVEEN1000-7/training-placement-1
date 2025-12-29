"""
Q : Given two sets of integers A and B, find and print their symmetric difference (elements present in either set but not in both) in ascending order, one per line.
"""

m = int(input())
a = set(map(int, input().split()))

n = int(input())
b = set(map(int, input().split()))

result = sorted(a.symmetric_difference(b))

for x in result:
    print(x)
