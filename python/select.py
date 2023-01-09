def sort(arr,size):
    for ind in range(size):
        min=ind
        for j in range(ind+1,size):
            if arr[j]<arr[min]:
                min=j
        (arr[ind],arr[min])=(arr[min],arr[ind])
arr=[1,6,3,8,2,9,1]
x=len(arr)
sort(arr,x)
print(arr)
