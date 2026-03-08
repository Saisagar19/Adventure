#include<iostream>
#include<climits>
#include<cfloat>
using namespace std;

// int main()
// {
//     const int i= 5;
//     int j = 4;

//     int area = i * j;
//     cout<<"\n"<<area;

//     const int radius = 4;
//     constexpr int pi = 3.14;

//     int areaOfCircle = pi * radius;
//     cout<<"\nArea of Circle:"<<areaOfCircle; 


//    // constexpr int k = 4 * j; // When you use normal int variable it didn't work
//     constexpr int k = pi * i;  //When you use const int variable it work
//     cout<<"\nK value: "<<k;

//     const int area2 = pi * j; // you can use constexpr variable with const keyword   
//     cout<<"\n"<<area2; 

//     constexpr int exp = 45 * 55; // works fine
//     cout<<"\n"<<exp;


//     // We can use const and constexpr it in normal int variable like areaOfCircle
//     //constexpr works with const keyword variable and normal int like 4 , 5
//     //we can not update value of const variable 
//     //we can not update value of constexpr variable 
// }


// // --------------------------------------------------------------------------------------------------




// int main()
// {

// cout<<"\nSize of Char: "<<sizeof(char);
// cout<<"\nSize of short: "<<sizeof(short);
// cout<<"\nSize of int: "<<sizeof(int);
// cout<<"\nSize of float: "<<sizeof(float);
// cout<<"\nSize of long: "<<sizeof(long);
// cout<<"\nSize of double: "<<sizeof(double);
// cout<<"\nSize of long double: "<<sizeof(long double);

// cout<<"\nSCHAR_MIN: "<<SCHAR_MIN;
// cout<<"\nSCHAR_MAX: "<<SCHAR_MAX;
// cout<<"\nUCHAR_MAX: "<<UCHAR_MAX;

// cout<<"\nSHRT_MIN: "<<SHRT_MIN;
// cout<<"\nSHRT_MAX: "<<SHRT_MAX;
// cout<<"\nUSHRT_MIN: "<<USHRT_MAX;

// cout<<"\nINT_MIN: "<<INT_MIN;
// cout<<"\nINT_MAX: "<<INT_MAX;
// cout<<"\nUINT_MAX: "<<UINT_MAX;

// cout<<"\nLONG_MIN: "<<LONG_MIN;
// cout<<"\nLONG_MAX: "<<LONG_MAX;
// cout<<"\nLONG_MAX: "<<ULONG_MAX;

// cout<<"\nFLOAT_MIN: "<<FLT_MIN;
// cout<<"\nFLOAT_MAX: "<<FLT_MAX;

// cout<<"\nDBL_MIN: "<<DBL_MIN;
// cout<<"\nDBL_MAX: "<<DBL_MAX;


// cout<<"\nLDBL_MIN: "<<LDBL_MIN;
// cout<<"\nLDBL_MAX: "<<LDBL_MAX;

// cout<<"\nFLT_DIG: "<<FLT_DIG;
// cout<<"\nDBL_DIG: "<<DBL_DIG;
// cout<<"\nLDBL-DIG: "<<LDBL_DIG;

// return 0;

// }



int main()
{

unsigned int var = UINT_MAX;
cout<<var;

var = var + 22;
cout<<"\n"<<var; // returns 0 means it recycle like 0,1,2 to unsigned int max number

int var2 = INT_MAX;
cout<<"\n"<<var2;

var2 = var2 + 1;
cout<<"\n"<<var2; // returns negative value INT_MIN means it recycle from INT_MIN to INT_MAX

return 0;

}