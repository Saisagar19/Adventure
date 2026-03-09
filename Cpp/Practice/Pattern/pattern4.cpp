#include<iostream>
using namespace std;

// Q.4  Write a program to generate a following #'s triangle:-       
// #				
// #	#			
// #	#	#		
// #	#	#	#	
// #	#	#	#	# 


int main()
{
    for(int i = 0;i<5;i++)
    {
        for(int j = 0; j <=i;j++)
        {
            cout<<"#";
        }
        for(int j = 4; j>=0;j--)
        {
            cout<<" ";
        }
        cout<<"\n";
    }

    return 0;
}