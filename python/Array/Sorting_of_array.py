from array import *
a = array('i',[])
for i in range(5):
    s =int(input('Enter no: '))
    a.append(s)
min =0
max=0
count=0
e=0
o=0
for i in a:
    if i>=0:
        min+=1
    if i<0:
        max+=1
    if i==0:
        count+=1
    
    if i%2==0:
            e+=1
    if i%2!=0 :
            o+=1
            
print('\nNo. of Positive no: ',min)

print('\nNo. of Negative no: ',max)

print('\nNo. of Odd no: ',o)

print('\nNo. of Even no: ',e)

print('\nNo. of 0\'s no: ',count)
            
        
    
