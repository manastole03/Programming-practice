#include<iostream>
#include<math.h>

using namespace std;

class Triangle
{
	public:
	void area(int a,int b,int c);
	void perimeter(int a,int b,int c);
};

void Triangle::area(int a,int b,int c)
{
	float s=((a+b+c)/2.0),A=sqrt(s*(s-a)*(s-b)*(s-c));
	cout<<"Area of a triangle is: "<<A<<" sq. units\n";
}

void Triangle::perimeter(int a,int b,int c)
{
	cout<<"Perimeter of a triangle is: "<<a+b+c<<" units\n";
}

int main()
{
	Triangle tr;
	int side1=3,side2=4,side3=5;
	tr.area(side1,side2,side3);
	tr.perimeter(side1,side2,side3);
	return 0;
}
