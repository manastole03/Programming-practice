#Write a python program to calculate the average value of array elements. 


num=int(input('how many numbers you want: '))
list=[]
for i in range(num):
    enter=int(input('enter the number: '))
    list.append(enter)

avg_list=sum(list)/len(list)

print('the array is: ',list)
print('the average of elements are: ',float(avg_list))



