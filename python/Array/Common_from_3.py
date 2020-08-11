array1=[]
array2=[]
array3=[]
n=int(input('How many elements u want in array1: '))
for i in range(n):
    f= int(input('Enter no: '))
    array1.append(f)
array2=[]
n=int(input('How many elements u want in array: '))
for i in range(n):
    f= int(input('Enter no: '))
    array2.append(f)
array3=[]
n=int(input('How many elements u want in array: '))
for i in range(n):
    f= int(input('Enter no: '))
    array3.append(f)
print('Entered array: ',array1)
print('Entered array: ',array1)
print('Entered array: ',array3)
common=[]
for i in array1:
    for j in array2:
        for k in array3:
            if i==j==k:
                common.append(i)
print(len(common),'- Common elements found in above three arrays & they are: ',common)
                

