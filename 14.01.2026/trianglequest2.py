# QUESTION: Print a palindromic triangle of size n using only one print statement and no strings.

n = int(input())
for i in range(1, n + 1): print((10**i // 9) ** 2)
