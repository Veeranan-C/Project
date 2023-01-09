def insert(arr):
    for i in range(1,len(arr)):
        key=arr[i]
        j=i-1
        while j>=0 and key<arr[j]:
            arr[j+1]=arr[j]
            j-=1
        arr[j+1]=key
arr=[8,6,3,7,3,7]
insert(arr)
list=[]
for i in range(len(arr)):
    list.append(arr[i])
print(list)
