#Write a python program to remove a specific element from an array. 


inp=input('enter alphabetical elements separated by space: ')
split=inp.split()
print('the list of array is: ',split)
char=input('enter the element you want to remove: ')

a=0
index=0

for i in range(len(split)):
    if split[i]==char:
        a = -1
        index=split[i]

if a==-1:
    split.remove(index)
    print('the new list of array is: ',split)
else:
    print('element not present in list of array')

