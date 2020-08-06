from array import *
n=int(input('How many numbers u want in array: '))
a = array('i',[])
for i in range(n):
    a.append(int(input('Enter no: ')))
print('Entered array : ',a)
d= 0
for j in range(n):
    for i in range(n):
        if a[d]<=a[i]:
            a[d],a[i]=a[i],a[d]
    d+=1    
print(a)
            
        
    
