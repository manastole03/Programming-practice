from array import *
n=int(input('How many numbers u want in array: '))
a = array('i',[])
for i in range(n):
    a.append(int(input('Enter no: ')))
print('Entered array : ',a)
max1=max(a)
indmax1=a.index(max1)
a.remove(max1)
max2=max(a)
diff=max1-max2
a.insert(indmax1,max2)
a.insert((indmax1+1),diff)
print(a)

