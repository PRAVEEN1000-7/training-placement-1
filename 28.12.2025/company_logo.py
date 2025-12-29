"""
Q : Given a lowercase string, find the top three most common characters.
Print each character with its count, sorted by descending frequency, and alphabetically if frequencies are equal.
"""

from collections import Counter

if __name__ == '__main__':
    s = input().strip()

    freq = Counter(s)

    result = sorted(freq.items(), key=lambda x: (-x[1], x[0]))

    for ch, cnt in result[:3]:
        print(ch, cnt)
