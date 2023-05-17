n,k = map(int,input().split())
m = (10 ** 9) + 7
if n != 0:
    print((pow(k,n,m)-1)*pow(k-1,m-2,m)%m)
else:
    print(0)