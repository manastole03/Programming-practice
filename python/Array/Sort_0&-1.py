array=[]
n=int(input('How many elements u want in array: '))
for i in range(n):
    f= int(input('Enter no: '))
    array.append(f)
print('Enteredarray: ',array)
def sort_0_1():
    o=0
    l=-1
    for i in array:
        if i==o:
            return 0
        if i==l:
            return -1
res=sort_0_1()
if res==0:
    print('O present in array!')
else:
    print('-1 is present in array!')
            
        
