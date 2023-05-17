n = int(input())
a = []
for i in range(n + 1):a.append(i)
a[1] = 0; i = 2
while i <= n:
    if a[i] != 0:
        j = i + i
        while j <= n:
            a[j] = 0
            j = j + i
    i += 1
a = set(a)
a.remove(0)
ism=["Bobur","Ali"]
if n==1:
    print("Ali")
else:
    print(ism[(len(a)%2)])