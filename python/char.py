filename=input("Enter the file name=")
with open(filename) as file:
    letter=input("Enter the character=")
    count=0
    txt=file.read()
    for char in txt:
        if char==letter:
            count+=1
print(letter," found ",count," times")
