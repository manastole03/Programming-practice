#Write a Python program to get a single string from two given strings, separated by a space and swap the first two characters of each string. 

def chars(a, b):
  str1 = b[:2] + a[2:]
  str2 = a[:2] + b[2:]

  return str1+ ' ' + str2
print(chars('abc', 'xyz'))
