#include <iostream>
using namespace std;

int main() {
    int numbers[10] = {7, 5, 6, 12, 35,26,20,25,16,1};
    int number;

    cout << "\nThe numbers are: ";

   
    for (int i = 0; i < 10; ++i) {
        cout << numbers[i] << " ";
    }
    
    	cout<<"\n Enter number to be searched ";
		cin>>number;
		int flag=0;
    
    	for(int i=0;i<10;i++)
    {
        if(numbers[i]==number)
        {
           cout<<"Number is Present";
           flag=1;
        }
    }
    if(flag==0)
    {
        cout<<"\nNumber not found in the record";
    }
     return 0;
}

   

		
