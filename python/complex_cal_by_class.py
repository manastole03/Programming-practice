class complex():
    def __init__(self,a,b,p,q):
        self.a = a
        self.b=b
        self.p=p
        self.q=q
    def sum1(self):
        x= self.a+self.p
        y= self.b+self.q
        print('Sumation of two given complex no : ',x,' + ',y,'i')
    def dif(self):
        x= self.a-self.p
        y= self.b-self.q
        print('Difference of two given complex no : ',x,' + ',y,'i')
    def mul(self):
        x=(self.a*self.p)-(self.b*self.q)
        y=(self.a*self.q)+(self.p*self.b)
        print('Multiplication of  two complex no : ',x,' + ',y,'i')
        
       
def main():
    print('a+bi')
    a = int(input('enter a: '))
    b = int(input('enter b: '))
    print('First no is :',a,' + ',b,'i')
    print('px+q')
    p = int(input('enter p: '))
    q = int(input('enter p: '))
    print('Second no is :',p,' + ',q,'i')
    s= complex(a,b,p,q)
    s.sum1()
    s.dif()
    s.mul()
if __name__ == '__main__':
    main()
