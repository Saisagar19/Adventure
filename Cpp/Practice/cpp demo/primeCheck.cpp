#include<iostream>
using namespace std;

int main()
{
	int num,i;
	int count = 0;
	cout<<"Enter a number to check prime or not: ";
	cin>>num;
	
	//TC = O(sqrt(n))
	
	for(i = 1; i*i<=num; i++)
	{
		if(num%i==0 && num!=1)
		{
			count++;
			if((num/i) != i)
			{
				count++;	
			}	
		}	
	}
	if(count==2)
	{
		cout<<"True";
	}
	else
	{
		cout<<"False";
	}
		
}
