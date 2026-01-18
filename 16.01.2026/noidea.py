# QUESTION:
# Calculate total happiness based on liked and disliked sets.

n, m = map(int, input().split())
arr = list(map(int, input().split()))
A = set(map(int, input().split()))
B = set(map(int, input().split()))

happy = 0

for x in arr:
    if x in A:
        happy += 1
    elif x in B:
        happy -= 1

print(happy)
