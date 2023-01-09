def exp(x,y):
    if y==0:
        return 1
    else:
        return(x*exp(x,y-1))
x=int(input("x="))
y=int(input("y="))
print(exp(x,y))
