
class rectangle():
    def __init__(self,length,breadth):
        self.length = length
        self.breadth = breadth
    def area(self):
        area = self.length *self.breadth
        print('Area of rectangle is : ',area)
if __name__ == '__main__':
    length = int(input('Enter length of rectangle: '))
    breadth = int(input('Enter breadth of rectangle : '))
    a=rectangle(length,breadth)
    a.area()
