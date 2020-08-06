#Write a python program to find the index of an array element. 


inp=input('enter alphabetical elements separated by space: ')
split=inp.split()
print('the list of array is: ',split)
char=input('enter the value you want to find: ')

a=0
index=0

for i in range(len(split)):
    if split[i]==char:
        a = 1
        index=i

if a==1:
    print('element is present in array at position: ',index+1)
else:
    print('element not present in list of array')

