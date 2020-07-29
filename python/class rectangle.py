#Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
#First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
#Length and breadth of rectangle are entered through keyboard.


class rectangle:
    def setDim(self,length,breadth):
        self.length=length
        self.breadth=breadth
        return length,breadth

    def getarea(self):
        self.area=self.length * self.breadth
        print('the area of rectangle is : ',self.area)

obj1=rectangle()
l=int(input('enter length(cm) : '))
b=int(input('enter breadth(cm) : '))
obj1.setDim(l,b)
obj1.getarea()
