from array import *
a = array('i',[1,2,3,4,5,5,7,8])
for i in a:
    print(i)
    
#append at end
a.append(int(input('\nEnter no to append: ')))
print('\n',a)

#reverse array
print('\n',a[::-1])

#length  of array
print('\nLength of array: ',a.itemsize)

#memory in bytes
print('\nCurrent memory address and length of buffer element: ',a.buffer_info())
print('Memory in bytes: ',a.buffer_info()[1]*a.itemsize)

#no of occurence
n=int(input('\nEnter no that u have to calculate How many times no is occured: '))
print('No occured: ',a.count(n),' times')


#ierrable append
a.extend(a)
print(a)

#machine value in bytes
v= a.tobytes()
print('\nBytes to string is: ',v)

#append list to array
list=[]
k= int(input('\nHow many no u want in list:'))
for i in range(k):
    q= int(input('Enter no: '))
    list.append(q)
    a.append(list[i])
print(a)

#append at postion 2

a.insert(1,int(input('\nEnter appending element at postion 2: ')))
print(a)

#remove by index
a.remove(a[int(input('\nEnter index of Removing element: '))])
print(a)

#remove first occurence
a.remove(int(input('\nEnter Removing element: ')))
print(a)

#array to list
list1=[]
for i in a:
    list1.append(i)
print('\nList is: ',list1)

#Duplicates
d= set(a)
if len(a)!=len(d):
    print('\nFalse,Duplicates occured!')
else:
    print ('\nTrue,duplicates not occured!')
    
