def bin(arr,x,low,high):
    if high>=low:
        mid=(low+high)//2
        if(arr[mid]==x):
            return mid
        elif(arr[mid]>x):
            return bin(arr,x,low,mid-1)
        else:
            return bin(arr,x,mid+1,high)
    else:
        #return bin(arr,x,mid+1,high)
        return -1
arr=[3,6,3,7,4,7,8,4,6]
x=8
r=bin(arr,x,0,len(arr)-1)
if(r!=-1):
    print(r)
else:
    print("element not found")
       
