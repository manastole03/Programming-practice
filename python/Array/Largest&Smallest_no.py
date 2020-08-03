
from array import *
arr= array('i',[])
for i in range(10):
    g= int(input('Enter no: '))
    arr.append(g)
print(arr)
min = 0
max =100
for i in arr:
    if min<=i:
        min = i
    if max>=i:
        max=i
print('Largest no from array :',min)
print('Smallest no from array: ',max)
