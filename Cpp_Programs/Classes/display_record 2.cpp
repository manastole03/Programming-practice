#include<iostream>
using namespace std;
class student
{
	private:
		
		int rollno;
		char address[50];
		int mobile_no;
		int n;
	public:
		void getdata();
		void display();
	
};

void student::getdata()
{
   
    cout<<"Enter the Roll.no : ";
    cin>>rollno;
     cout<<"Enter Address of the student : ";
    cin>>address;
    cout<<"Enter Mobile no : ";
    cin>>mobile_no;
}
void  student::display()
{
    
    
    cout<<"  Roll.no : "<<rollno<< "  Address : "<<address<<" Mobile no :"<<mobile_no<<"\n";
   
   
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





    
      
    


