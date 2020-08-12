# Write a Python program to count the number of characters (character frequency) in a string.


inp=input('enter the string: ')
dict={}
for i in inp :
    keys = dict.keys()
    if i in keys:
        dict[i]+=1
    else:
        dict[i]=1

print(dict)

