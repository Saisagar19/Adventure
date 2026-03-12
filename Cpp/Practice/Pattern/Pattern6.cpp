#include<iostream>
using namespace std;

//Hollow Triangle
// *     
// **
// * *
// *  *
// *   *
// ******


int main()
{
    int i, j;

    for(i = 0; i<6;i++)
    {
        for(j=0;j<6;j++)
        {
            // cout<<"*";
            if((i == 5) || (i==j) || (j == 0))
            {
                cout<<"*";
            }
            else{
                cout<<" ";
            }
        }
        cout<<"\n";
    }
}