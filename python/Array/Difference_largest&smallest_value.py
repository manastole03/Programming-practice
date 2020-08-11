array=[]
n=int(input('How many elements u want in array: '))
for i in range(n):
    f= int(input('Enter no: '))
    array.append(f)
print('Entered array: ',array)
if len(array)>=1:
    max1=max(array)
    min1 = min(array)
    diff=max1-min1
    print('The difference of largest &smallest value from array: ',diff)
