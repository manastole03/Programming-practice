## MATRIX
import numpy as np
from array import *
 
a=0
b=0
r=0
c=0
mat1=[]
class matrix():
    def __init__(self,a,b,c,r,mat1):
        self.a=a
        self.b=b
        self.c=c
        self.r=r
        self.mat1 = mat1
        
    def get_info(self):
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
        
    def two_D_array(self):
        if len(self.mat1) ==4:
            math1 =np.array([self.mat1])
            self.c =math1.reshape(2,2)
            print(self.c)
        else:
            print('Can\'t convert to 2D array as elements in matrix are: ',len(self.mat1))



s = matrix(a,b,c,r,mat1)
s.get_info()
s.row_column()
s.two_D_array()


