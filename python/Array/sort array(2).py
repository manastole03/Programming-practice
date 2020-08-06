#Write a python program to sort a numeric array and a string array. 


inp=input('enter alphabetical elements separated by space: ')
inp1=int(input('enter the number of values you want: '))
split=inp.split()
print(split)
list=[]

for i in range(inp1):
    enter=int(input(f'enter value{i}: '))
    list.append(enter)

split.sort()
list.sort()
print(split)
print(list)


