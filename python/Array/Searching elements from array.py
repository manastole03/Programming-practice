from array import *
arr = array('i',[])
for i in range(10):
    g= int(input('Enter no: '))
    arr.append(g)
print(arr)

ask= int(input('Which no you want to search in array: '))
for i in arr:
    if ask == arr[i]:
        print('Search found!')
        break
else:
    print('Search not found!')
    
