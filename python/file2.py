filename=input("Enter the filename=")
with open(filename) as file:
    buf=file.read()
    letter=input("Enter the character=")
    count=0
    for i in buf:
        if i==letter:
            count+=1
print(letter,"appears",count,"times")
