with open("first1.txt","rb") as file1:
    with open("third4.txt","wb") as file2:
        while True:
            buf=file1.read()
            if (len(buf)!=0):
                file2.write(buf)
            else:
                break
print("File copied successfully")
