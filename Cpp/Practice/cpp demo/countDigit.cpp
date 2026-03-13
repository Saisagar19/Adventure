#include<iostream>
using namespace std;

int main()
{
	int num,last_digit,count = 0;
	
	cout<<"Enter a number: ";
	cin>>num;
	
	if(num<0) num=num * -1;
	if(num == 0) count = 1;
	
	while(num>0)
	{
		last_digit=num%10;
		count++;
		num/=10;
	}
	cout<<"count of digit: "<<count;
	
}
