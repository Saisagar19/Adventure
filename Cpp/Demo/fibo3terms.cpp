#include<iostream>
using namespace std;

int main()
{
    int i, t1,t2,t3,nt;
    cout<<"Fibo series: ";
    t1=0;
    t2=1;
    t3=1;
    cout<<t1<<" "<<t2<<" "<<t3<<" ";

    for(int i = 4; i<25; i++)
    {
        nt = t1 + t2 + t3;
        cout<<nt<<" ";
        t1 = t2;
        t2 = t3;
        t3 = nt;
    }

    return 0;
}


// fibonaci Code

// int main()
// {
//     int i, t1,t2,nt;
//     cout<<"Fibo series: ";
//     t1=0;
//     t2=1;
//     // t3=1;
//     cout<<t1<<" "<<t2<<" ";

//     for(int i = 4; i<25; i++)
//     {
//         nt = t1 + t2;
//         cout<<nt<<" ";
//         t1 = t2;
//         t2 = nt;
//         // t3 = nt;
//     }

//     return 0;
// }