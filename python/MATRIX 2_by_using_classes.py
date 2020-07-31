## MATRIX 2
import numpy as np
from array import *
 
a=0
b=0
r=0
c=0
mat1=[]
x=0
y=0
z=0
v=0
mat2 =[]
math1 = []
math2=[]
math3 = []
class matrix():
    def __init__(self,a,b,c,r,x,y,z,v,mat2,mat1,math1,math2,math3):
        self.a=a
        self.b=b
        self.c=c
        self.r=r
        self.mat1 = mat1
        self.x=x
        self.y=y
        self.z=z
        self.v=v
        self.mat2 = mat2
        self.math1 = math1
        self.math2= math2
        self.math3= math3
        
        
        
    def get_info(self):
        print('MATRIX 1')
        self.a= int(input('Enter no of rows: '))
        self.b = int(input('Enter no of colunmns: '))
        
    def row_column(self):
        self.mat1=[]
        for i in range(self.a):
            for j in range(self.b):
                print('Element at Position ',i,j)
                self.r = int(input('Enter element: '))
                self.mat1.append(self.r)
        print(self.mat1)
        self.math1 =np.array([self.mat1])
        self.c =self.math1.reshape(self.a,self.b)
        print(self.c)
        
        
        print('MATRIX 2')
        self.x= int(input('Enter no of rows: '))
        self.y = int(input('Enter no of colunmns: '))
        self.mat2=[]
        for i in range(self.x):
            for j in range(self.y):
                print('Element at Position ',i,j)
                self.z = int(input('Enter element: '))
                self.mat2.append(self.z)
        print(self.mat2)
        self.math2 =np.array([self.mat2])
        self.v =self.math1.reshape(self.x,self.y)
        print(self.v)
        
        
    def add(self):
        if (a==x and b==y):
            self.math3 = self.math1+self.math2
            print('Addition of matrices are: ',self.math3)
        else:
            print('Matrices unable to add!')
        
    def mul(self):
        if (a==y or b==x):
            print('Multiplication of two matrices are :',self.math1*self.math2)
        else:
            print('Matrices unable to multiply!')

s = matrix(a,b,c,r,mat1,x,y,z,v,mat2,math1,math2,math3)
s.get_info()
s.row_column()
s.add()
s.mul()

