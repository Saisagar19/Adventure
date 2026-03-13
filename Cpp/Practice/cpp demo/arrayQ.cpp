#include<iostream>
using namespace std;
int main()
{
	int size,i;
	cout<<"Enter size of a array: ";
	cin>>size;
	int arr[size];

	cout<<"Enter elements of an array: ";	
	for(i = 0; i < size; i++)
	{
		cin>>arr[i];
	}
	
	for(i = 0; i < size; i++)
	{
		cout<<" "<<arr[i];
	}
	
	int last = arr[size - 1];
	for(i = size - 1; i>0; i--)
	{
		arr[i] = arr[i - 1];
	}
	arr[0] = last;
	
	cout<<"\n";
	for(i = 0; i < size; i++)
	{
		cout<<" "<<arr[i];
	}
	
	return 0; 
	
	
}
