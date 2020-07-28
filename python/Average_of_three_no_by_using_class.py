class average():
    def __init__(self,a,b,c):
        self.a = a
        self.b = b
        self.c = c
    def avg(self):
        avg = print((self.a+self.b+self.c)/3)
if __name__ =='__main__':
    a = int(input('Enter a no: '))
    b = int(input('Enter a no: ')) 
    c = int(input('Enter a no: ')) 
    w= average(a,b,c)
    w.avg()
