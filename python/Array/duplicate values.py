#Write a pyhton program to find the duplicate values of an array of integer values. 


inp=int(input('enter how many numbers you want to enter '))
list=[]
for i in range(0,inp):
    enter=int(input('enter the number: '))
    list.append(enter)

res = []
for i in list:
    if i not in res:
        res.append(i)

print("The list after removing duplicates : " + str(res))
