"""
Q : Given a string of digits, compress consecutive repeated characters by replacing each group with
(count, digit) using itertools.groupby.
"""

from itertools import groupby

if __name__ == '__main__':
    s = input().strip()
    
    result = []
    for key, group in groupby(s):
        result.append(f"({len(list(group))}, {key})")
    
    print(" ".join(result))
