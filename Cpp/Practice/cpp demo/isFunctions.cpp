#include<iostream>
using namespace std;

bool isDigit(char);
bool isPrime(int);

int main()
{
	int n, choice;
	char var;
	
	do{
		cout<<"1. is Digit: ";
		cout<<"2. is Prime: ";
		cout<<"3. Exit";
		cout<<"\nEnter your choice: ";
		cin>>choice;
		
		if(choice == 1)
		{
			cout<<"Enter char: ";
			cin>>var;
		}
		else if(choice == 2)
		{
			cout<<"Enter num: ";
			cin>>n;
		}
		
		switch(choice)
		{
			case 1: 
				if(isDigit(var))
				{
					cout<<var<<" is a digit\n";
				}
				else
				{
					cout<<var<<" is not a digit\n";
				}
			break;
			
			case 2:
				if(isPrime(n))
				{
					cout<<n<<" is a Prime\n";
				}
				else
				{
					cout<<n<<" is not a Prime\n";
				}
			break;
				
			case 3:
				break;
			
			default: 
				cout<<"Invalid number\n";
		}
		
		
	}while(choice!=3);
	
	return 0;
}

bool isDigit(char ch)
{
	if((ch >= '0') && (ch <= '9'))
	{
		return true;
	}
	else
	{
		return false;
	}
}

bool isPrime(int num)
{
	int i;
	for(i = 2; i<num; i++)
	{
		if(num%i == 0)
		{
			break;
		}
	}
	if(i == num)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
