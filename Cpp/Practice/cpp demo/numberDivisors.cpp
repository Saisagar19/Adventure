#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main()
{
//	int num, i;
//	cout<<"Enter a Number: ";
//	cin>>num;
//	
//	for(i = 1; i*i<=num;i++)
//	{
//		if(num%i==0)
//		{
//			cout<<i<<" ";
//			if((num/i) != i)
//			{
//				cout<<(num/i)<<" ";	
//			}	
//		}	
//	}

	vector<int> ls;
	int num, i;
	cout<<"Enter a number: ";
	cin>>num;

	for(i = 1; i*i<=num;i++)
	{
		if(num%i==0)
		{
			ls.push_back(i);
			if((num/i) != i)
			{
				ls.push_back(num/i);
			}
		}
	}
	sort(ls.begin(), ls.end());
	
	for(int i = 0; i < ls.size(); i++)
	{
	    cout << ls[i] << " ";
	}

	return 0;	
}
