a=[1000000000,1000000,1000,100]
b=["milliard ","million ","ming ","yuz "]
c=["","o'n ","yigirma ","o'ttiz ","qirq ","ellik ","oltmish ","yetmish ","sakson ","to'qson "]
d=["","bir ","ikki ","uch ","to'rt ","besh ","olti ","yetti ","sakkiz ","to'qqiz "]
def Natural(n):
    for i in range(4):
        if n>=a[i]:
            return Natural(n//a[i])+b[i]+Natural(n%a[i])
    return c[n//10]+d[n%10]

n=int(input())
a=Natural(n)
print(a)