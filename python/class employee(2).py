class Employee:

        def getinfo(self,salary,no_of_hours):
            self.salary=salary
            self.no_of_hours = no_of_hours

        def Addsal(self):
            if self.salary<500 or self.no_of_hours>6:
                if self.no_of_hours>6:
                    self.salary=self.salary+5
                if self.salary<500:
                    self.salary=self.salary+10
                print(f'the salary of employee {i+1} is : $', self.salary)
            else:
                print(f'the salary of employee {i+1} is : $',self.salary)

obj1=Employee()
no_of_emp = int(input('enter the number of employees '))
for i in range(int(no_of_emp)):

    sal = int(input('enter the salary in $ : $'))
    hrs = int(input('enter the working hours : '))
    obj1.getinfo(sal,hrs)
    obj1.Addsal()





