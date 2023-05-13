jil = int(input())
x = ""
if jil < 10:
    x = "000"
elif jil < 100:
    x = "00"
elif jil < 1000:
    x = "0"
if jil % 400 == 0 or jil % 4 == 0 and jil % 100 != 0:
    x = f"12/09/{x+str(jil)}"
else:
    x = f"13/09/{x+str(jil)}"
print(x)