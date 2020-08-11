from array import *
array=array('i',[])
n=int(input('How many elements u want in array: '))
for i in range(n):
    f= int(input('Enter no: '))
    array.append(f)
print('Entered array: ',array)
list=array.tolist()
print('Array converted to list - ',list)
