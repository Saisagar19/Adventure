#include<iostream>
using namespace std;

int main()
{
	// 1, 153,370,371,407,1634,8208,9474
	int num, rem, sum=0;
	cout<<"Enter a number: ";
	cin>>num;
	
	int temp = num;
	while(num!=0)
	{
		rem=num%10;
		sum = sum +(rem*rem*rem);
		num/=10;
	}
	if(temp==sum)
	{
		cout<<"Num is armstrong";
	}
	else{
		cout<<" num is not armstrong";
	}
	 
}
