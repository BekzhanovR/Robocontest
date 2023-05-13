n = int(input())
s = list(map(int,input().split()))
s.remove(max(s))
print(max(s))