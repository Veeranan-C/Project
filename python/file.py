with open("first.py","rb") as f1:
    with open("second1.py","wb") as f2:
        while True:
            buf=f1.readline()
            if len(buf)!=0:
                if buf[0]=='#':   
                   continue
                else:
                   f2.write(buf)
            else:
                break
print("process completed")
