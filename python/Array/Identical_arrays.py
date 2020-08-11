array1=[]
array2=[]

n=int(input('How many elements u want in array1: '))
for i in range(n):
    f= int(input('Enter no: '))
    array1.append(f)
n=int(input('How many elements u want in array2: '))
for i in range(n):
    f= int(input('Enter no: '))
    array2.append(f)
    
print('Entered array1: ',array1)
print('Entered array2: ',array2)
def identical():
    if len(array1)==len(array2):
        for i in array1:
            for j in array2:
                if i==j:
                    return True;
                else:
                    return False;
    return False
res=identical()
if res==True:
    print('identical!')
else:
    print('Not identical!')
