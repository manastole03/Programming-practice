#Write a python program to find the second smallest element in an array.


array=[]
inp=int(input('enter the number of elements(numbers): '))
for i in range(inp):
    enter=int(input(f'enter number {i+1}: '))
    array.append(enter)

array.sort()
print('the array is: ',array)
print('the second smallest element of array is: ',array[1])
