#include<iostream>
#include<math.h>

using namespace std;

class Rectangle
{
	public:
	void area(int a,int b);
	void perimeter(int a,int b);
};

void Rectangle::area(int a,int b)
{
	int A=(a*b);
	cout<<"Area of a rectangle is: "<<A<<" sq. units\n";
}

void Rectangle::perimeter(int a,int b)
{
	cout<<"Perimeter of a triangle is: "<<(2*a)+(2*b)<<" units\n";
}

int main()
{
	Rectangle rect1,rect2;
	int side1=4,side2=5;
	rect1.area(side1,side2);
	rect1.perimeter(side1,side2);
	//Rectangle rect2;
	int side11=5,side22=8;
	rect2.area(side11,side22);
	rect2.perimeter(side11,side22);
	return 0;
}
