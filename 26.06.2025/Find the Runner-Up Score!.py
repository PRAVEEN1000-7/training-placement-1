if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    
    if (2<=n<=10):
        arr.sort()
        m = max(arr)
        
        for i in range(n-1,-1,-1):
            if m==arr[i]:
                continue
            if m>arr[i]:
                m=arr[i]
                break
        print(m)
                
                
