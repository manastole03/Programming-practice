#include<iostream>
using namespace std;
int main()
{
	int a,b,temp;
	cout<<"Before swapping"<<endl;
	
	cin>>a>>b;
	
	temp=a;
	a=b;
	b=temp;
	
	cout<<"After swapping"<<endl;
	cout << "a = " << a << ", b = " << b << endl;

    return 0;
}
