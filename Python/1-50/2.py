a,b = map(int,input().split())

if a > b:
    x = ">"
elif a == b:
    x = "="
else:
    x = "<"

print(x)