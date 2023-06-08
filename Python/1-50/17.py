def sm(n):
 s=0
 while n>0:
  s+=n%10
  n=n//10
 return s
def tek(n):
 s=sm(n)
 if n%(s*s)==0:
  return True
 else:
  return False
def top(n):
 r=0
 x=0
 while n>r:
  x+=1
  if tek(x):
   r+=1
 return x
a=int(input())
print(top(a))