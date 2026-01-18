# QUESTION:
# Debug print_from_stream so that it correctly prints values using
# default arguments without sharing state between function calls.

class EvenStream(object):
    def __init__(self):
        self.current = 0

    def get_next(self):
        v = self.current
        self.current += 2
        return v

class OddStream(object):
    def __init__(self):
        self.current = 1

    def get_next(self):
        v = self.current
        self.current += 2
        return v

def print_from_stream(n, stream=None):
    if stream is None:
        stream = EvenStream()
    for _ in range(n):
        print(stream.get_next())

q = int(input())
for _ in range(q):
    name, n = input().split()
    n = int(n)
    if name == "even":
        print_from_stream(n)
    else:
        print_from_stream(n, OddStream())
