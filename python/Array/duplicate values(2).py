#Write a python program to find the duplicate values of an array of string values. 


inp=int(input('enter how many letters you want to enter '))
list=[]
for i in range(0,inp):
    enter=input('enter the letter: ')
    list.append(enter)

res = []
for i in list:
    if i not in res:
        res.append(i)

print("The list after removing duplicates : " + str(res))
