#include<iostream>
using namespace std;
int main()
{
	string s;
	cout<<"Enter String : ";
	cin >> s;
	int count_z=0,count_o=0;
	for(int i=0;i<s.size();i++)
	{
		if(s[i]=='z')
		  count_z++;
		else
		   count_o++;
	}
	if(2*count_z == count_o)
	   cout << "Yes" << endl;
	else
	   cout << "No" << endl;
}
