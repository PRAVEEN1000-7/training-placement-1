# Q :
# Given marks of students in multiple subjects, compute and print
# the average marks of each student using zip().

n, m = map(int, input().split())
marks = [list(map(float, input().split())) for _ in range(m)]

for s in zip(*marks):
    print(sum(s) / m)
