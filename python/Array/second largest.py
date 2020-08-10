#Write a python program to find the second largest element in an array. 


list=[]
inp=int(input('enter the number of elements(numbers): '))
for i in range(inp):
    enter=int(input(f'enter number {i+1}: '))
    list.append(enter)

list.sort(reverse=True)
print('the array is: ',list)
print('the second largest element of array is: ',list[1])
