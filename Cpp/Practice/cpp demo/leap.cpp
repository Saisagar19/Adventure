#include<iostream>
using namespace std;


class Assignment{
	
	string str;
	public:

	Assignment()
	{
		this -> str;
	}
	
	void q1(string str)
	{
		for(int i = 1;i<=5;i++)
		{
			cout<<str;
		}
	}
};

int main()
{
	Assignment a;
	a.q1("Hello"); 
	
	
	int year;
	cout<<"Enter year: ";
	cin>> year;
	
	if((year%100 != 0) && (year%4==0))
	{
		cout<<year<<" is a leap year.";
	}
	else if(year%400 == 0)
	{
		cout<<year<<" is a leap year";
	}
	else
	{
		cout<<year <<" Not a leap year.";
	}
	
	return 0;
}
