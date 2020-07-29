#Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'employee'

class employee:
    def employees(self,name,year_of_joining,address='0'):
        self.name=name
        self.year_of_joining=year_of_joining
        self.address=address
        print(name+'           '+year_of_joining+'            '+address)


obj1=employee()
print('name'+'     '+'year_of_joining'+'           '+'address')
obj1.employees('sam',' 1998','64C- WallsStreat')
obj1.employees('john','2000','25D- WallsStreat')
obj1.employees('robert',' 1997','12A- WallsStreat')
