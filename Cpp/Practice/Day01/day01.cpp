#include<iostream>
using namespace std;

int main()
{
    const int i= 5;
    int j = 4;

    int area = i * j;
    cout<<"\n"<<area;

    int radius = 4;
    constexpr int pi = 3.14;

    int areaOfCircle = pi * radius;
    cout<<"\nArea of Circle:"<<areaOfCircle; 

   // constexpr int k = 4 * j; // When you use normal int variable it didn't work
    constexpr int k = pi * i;  //When you use const int variable it work
    cout<<"\nK value: "<<k;

    const int area2 = pi * j; // you can use constexpr variable with const keyword   
    cout<<"\n"<<area2; 

    constexpr int exp = 45 * 55; // works fine
    cout<<"\n"<<exp;


    //constexpr works with const keyword variable and normal int like 4 , 5
    //we can not update value of const variable 
    //we can not update value of constexpr variable 
}