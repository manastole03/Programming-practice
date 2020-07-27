a = input('Enter a word which contains two characters : ')
b = a[0]
c = a[-1]
count = 0
max1 = 0
for i in range(0,len(a)):
    if b == a[i]:
        count +=1
    if c == a[i]:
        max1 +=1
if count*2 ==max1:
    print('YES!')
else:
    print('NO!')
