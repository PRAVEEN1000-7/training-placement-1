# Q :
# Given n words, print the number of distinct words and
# the count of each word in the order of first appearance.

n = int(input())
d = {}
order = []

for _ in range(n):
    w = input().strip()
    if w in d:
        d[w] += 1
    else:
        d[w] = 1
        order.append(w)

print(len(order))
for w in order:
    print(d[w], end=" ")
