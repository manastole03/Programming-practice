#include<iostream>
using namespace std;
int main()
{
  float num1, num2;

  cout << "Enter two Number: ";
  cin >> num1 >> num2;

  //Addition of two number
  cout << num1 << "+" << num2 << " = "<< num1+num2 << endl;

  //Subtraction of two number
  cout << num1 << "-" << num2 << " = "<< num1-num2 << endl;

  //Multiplication of two number
  cout << num1 << "*" << num2 << " = "<< num1*num2 << endl;

  //Division of two number
  cout << num1 << "/" << num2 << " = "<< num1/num2 << endl;

  return 0;
}
