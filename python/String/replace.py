# Write a Python program to get a string from a given string where all occurrences of its first char have been changed to '$', except the first char itself. 


inp=input('enter the string: ')
char = inp[0]
inp = inp.replace(char, '$')
inp = char + inp[1:]
print(inp)

