a = "Yes"
n = int(input())
s = sum(map(int,input().split()))
if s <= n:
    a = "No"
print(a)