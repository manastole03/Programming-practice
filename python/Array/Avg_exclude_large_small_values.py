array=[]
n=int(input('How many elements u want in array: '))
for i in range(n):
    f= int(input('Enter no: '))
    array.append(f)
print('Entered array: ',array)
mx=max(array)
mn=min(array)
array.remove(mn)
array.remove(mx)
sum1=0
for i in array:
    sum1 +=i
avg=sum1/len(array)
print('Average of array after excluding large & small value: ',avg)
