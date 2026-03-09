#include<iostream>
using namespace std;


// Q.1  Write a program to generate a following structure:
//           @@@@@
//           @@@@@
//           @@@@@
//           @@@@@
//           @@@@@

int main()
{
    for(int i = 0;i<5;i++)
    {
        for(int j = 0; j<5;j++)
        {
            cout<<"@";
        }
        cout<<"\n";
    }
    return 0;
}