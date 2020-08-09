# Write a python program to find the maximum and minimum value of an array. 



list=[]
inp=int(input('enter the number of elements(numbers): '))
for i in range(inp):
    enter=int(input(f'enter number {i+1}: '))
    list.append(enter)

print('the array is: ',list)
print('the maximum value in list array is: ',max(list))
print('the minimum value in list array is: ',min(list))
