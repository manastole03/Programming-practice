from math import *

class triangle:
    def __init__(self,a,b,c):
        self.a= a
        self.b= b
        self.c= c
    def area(self):
        height = sqrt((self.c**2)-(self.a/2)**2)
        area=(1/2)*height*self.b
        perimeter = self.a + self.b + self.c
        print('Area of triangle is : ',area)
        print('Perimeter of triangle is : ',perimeter)

a =int(input('Enter side :'))
b=int(input('Enter side :'))
c =int(input('Enter side :'))
a=triangle(a,b,c)
a.area()
    
