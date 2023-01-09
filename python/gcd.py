def GCD(x,y):
    rem=x%y
    if(rem==0):
        return y
    else:
        return GCD(y,rem)
x=int(input("x="))
y=int(input("y="))
print(GCD(x,y))
