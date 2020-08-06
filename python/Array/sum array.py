#Write a python program to sum values of an array. 


num=int(input('how many numbers you want to add: '))
list=[]
for i in range(num):
    enter=int(input('enter the number: '))
    list.append(enter)

print('the array is: ',list)
print('the sum of elements are: ',sum(list))

