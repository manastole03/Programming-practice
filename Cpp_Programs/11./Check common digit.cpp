#include<iostream>
using namespace std;
int main()
{
	int first_no,second_no,i,j;
	cout<<"Enter two numbers between 25 and 75 :\n";
	
	cout<<"Input First number ";
	cin>>first_no;
	cout<<"Input Second number ";
	cin>>second_no;

	if (first_no%10==second_no%10)
	{
		cout<<"True";
	}
	if ((first_no/10)==second_no/10)
	{
		cout<<"True";
		
	}

	return 0;
	
}
