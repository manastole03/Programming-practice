from array import *
arr= array('i',[])
for i in range(10):
    g= int(input('Enter no: '))
    arr.append(g)
print(arr)

def sum(arr):
    sum1=0
    for i in arr:
        sum1 +=i
    print('Sum of elements in array :',sum1)
def mul(arr):
    pro = 1
    for i in arr:
        pro= pro*i
        
    print('Product of elements in array :',pro)
    
sum(arr)
mul(arr)
        
        
