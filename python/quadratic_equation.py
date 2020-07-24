#Quadratic
from math import *
def Quad():
    print('ax²+bx+c=0')
    a = int(input('Enter value of a: '))
    b = int(input('Enter value of b: '))
    c = int(input('Enter value of c: '))
    
    print()
    disc = b**2-4*a*c
    disc1 = sqrt(disc)
    positive = ((-b + disc1) / (2**a))
    
    negative = ((-b - disc1) / (2**a))
    print('Roots are : {0},{1}'.format(positive,negative))
Quad()

    

