# To accept the input from user for elements in list and tuple

lst = []

n = int(input("Enter number of elements : "))
for i in range(0, n):
    ele = int(input())
    lst.append(ele)

input_for_tuple=input('enter the numbers tuple : ')
list=input_for_tuple.split(",")
tuple=tuple(input_for_tuple)

print(lst)
print(tuple)
