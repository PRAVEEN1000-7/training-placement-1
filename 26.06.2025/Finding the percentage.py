if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    
    c = student_marks[query_name]
    count = len(c)
    
    avg = float(sum(c)/count)
    print(f"{avg:.2f}")
