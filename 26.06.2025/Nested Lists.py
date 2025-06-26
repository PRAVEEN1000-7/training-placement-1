if __name__ == '__main__':
    lst = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        lst.append([name,score])
    
    lst = sorted(lst,key=lambda y : y[1])
    
    low = lst[0][1]
    
    lst = [ x for x in lst if x[1]!=low]
    
    sl =lst[0][1]
    
    lst = [ x for x in lst if x[1]==sl]
    
    lst=sorted(lst,key = lambda x :x[0])
    
    for n,s in lst:
        print(n)    
    
    
