#Write a python program to test if an array contains a specific value. 


inp=input('enter alphabetical elements separated by space: ')
split=inp.split()
print('the list of array is: ',split)
char=input('enter the letter you want to find: ')

a=0

for i in range(len(split)):
    if split[i]==char:
        a = a + 1

if a>=1:
    print('element is present in array')
else:
    print('element not present in list of array')

