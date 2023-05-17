n, k = map(int,input().split())
if n == 0:
  output=1
else:
  output = pow(k+1,n,1000000007)
print(output)