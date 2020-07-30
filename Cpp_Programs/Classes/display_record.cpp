#include<iostream>
using namespace std;
class student
{
	private:
		char name[20];
		int rollno;
		
		int n;
	public:
		void getdata();
		void display();
	
};

void student::getdata()
{
    cout<<"\nEnter Name of the student : ";
    cin>>name;
    cout<<"Enter the Roll.no : ";
    cin>>rollno;
    
}
void  student::display()
{
    
    
    cout<<"  Name : "<<name<< "  Rollno : "<<rollno<<"\n";
    
   
}
int main()
{
    student std;
	int n;
	int i;
	cout << "\nEnter total number of students: ";
    cin >> n;    
    
    {
    	cout << "Enter details of student "  << ":\n";
    	for(i=0;i< n; i++){
    		
        	std.getdata();
    		
		}
        
    }
    
    {
    	cout << "\nDetails of student "  << ":\n";
    	for(i=0;i< n; i++){
    	
        	std.display();
    		
		}
        
    }
    return 0;
}





    
      
    


