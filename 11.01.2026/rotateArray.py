# Q : Rotate the given array to the right by k steps.

def rotate(arr, k):
    n = len(arr)
    k = k % n
    return arr[n-k:] + arr[:n-k]


arr = [1, 2, 3, 4, 5]
k = 2

print(rotate(arr, k))

