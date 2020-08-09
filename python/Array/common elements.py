#Write a python program to find the common elements between two arrays of integers.


def sets(set1,set2):
    set_a=set(set1)
    set_b=set(set2)
    if len(set_a & set_b)>1:
        print('the common elements are: ',set_a & set_b)
    if len(set_a & set_b)==1:
        print('the common element is: ', set_a & set_b)
    else:
        print('no common elements')

list=[]
inp=int(input('enter the number of elements(numbers) for 1st set: '))
for i in range(inp):
    enter=int(input(f'enter number {i+1}: '))
    list.append(enter)

list1=[]
inp1=int(input('enter the number of elements(numbers) for 2nd set: '))
for i in range(inp1):
    enter1=int(input(f'enter number {i+1}: '))
    list1.append(enter1)

print('The first set is: ',set(list))
print('The second set is: ',set(list1))

sets(list,list1)
