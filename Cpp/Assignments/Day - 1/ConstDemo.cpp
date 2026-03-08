#include<iostream>
using namespace std;

int main()
{
	// const int j;  error: uninitialized const j

	const int i = 9;

	int num1 = 4;
    //	i = 20;      error: assignment of read-only variable i

    constexpr int j = 4 * 5;  // work fine, j is read only

    cout<<"\n j = "<<j;  // work fine

    //j = 15; // error: assignment of read-only variable j

    //constexpr int num2 = 4 * num1; error: the value of num1 is not usable in a constant expression

    constexpr int num2 = 4 * j + i; // works fine because j and i are also const

    cout<<"\n num2 = "<<num2;

	return 0;
}

/*Assignments #1:
  1. Play with the code by initializing different values to const and constexpr
    note down the findings

  2. Write a small program to demonstrate const and constexpr for calculating
     area of a circle.
*/
