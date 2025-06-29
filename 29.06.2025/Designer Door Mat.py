

n, m = map(int, input().split())

# Upper half
for i in range(n // 2):
    pattern = ('.|.' * (2 * i + 1)).center(m, '-')
    print(pattern)

# Middle row with WELCOME
print('WELCOME'.center(m, '-'))

# Lower half (mirror of upper half)
for i in range(n // 2 - 1, -1, -1):
    pattern = ('.|.' * (2 * i + 1)).center(m, '-')
    print(pattern)
