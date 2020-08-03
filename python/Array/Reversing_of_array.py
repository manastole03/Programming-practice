from array import *
arr1= array('i',[])
for i in range(10):
    g= int(input('Enter no: '))
    arr1.append(g)
print(arr1)

arr2= arr1[::-1]
print(arr2)
