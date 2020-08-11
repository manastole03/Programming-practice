array=[]
n=int(input('How many elements u want in array: '))
for i in range(n):
    f= int(input('Enter no: '))
    array.append(f)
print('Entered array: ',array)
even=[]
odd=[]
for i in array:
    if i%2==0:
        even.append(i)
    else:
        odd.append(i)
print('No of even no from array-  ',len(even))
print('No of odd no from array-  ',len(odd))
        

    

        
