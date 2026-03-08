/*Program to find out the size and limits of data types*/
#include<iostream>
#include<climits>
#include<cfloat>
using namespace std;
int main()
{
	cout<<"\nsizeof(char) = "<<sizeof(char);
	cout<<"\nsizeof(short) = "<<sizeof(short);
	cout<<"\nsizeof(int) = "<<sizeof(int);
	cout<<"\nsizeof(long) = "<<sizeof(long);
	cout<<"\nsizeof(float) = "<<sizeof(float);
	cout<<"\nsizeof(double) = "<<sizeof(double);
	cout<<"\nsizeof(long double) = "<<sizeof(long double);

	cout<<"\nSCHAR_MIN = "<<SCHAR_MIN;
	cout<<"\nSCHAR_MAX = "<<SCHAR_MAX;
	cout<<"\nUCHAR_MAX = "<<UCHAR_MAX;
	cout<<"\nSHRT_MIN = "<<SHRT_MIN;
	cout<<"\nSHRT_MAX = "<<SHRT_MAX;
	cout<<"\nUSHRT_MAX = "<<USHRT_MAX;
		
	cout<<"\nINT_MIN = "<<INT_MIN;
	cout<<"\nINT_MAX = "<<INT_MAX;
	cout<<"\nUINT_MAX = "<<UINT_MAX;
	
	cout<<"\nLONG_MIN = "<<LONG_MIN;
    cout<<"\nLONG_MAX = "<<LONG_MAX;
    cout<<"\nULONG_MAX = "<<ULONG_MAX;
    
	cout<<"\nFLT_MIN = "<<FLT_MIN;
	cout<<"\nFLT_MAX = "<<FLT_MAX;

	cout<<"\nDBL_MIN = "<<DBL_MIN;
	cout<<"\nDBL_MAX = "<<DBL_MAX;

	cout<<"\nLDBL_MIN = "<<LDBL_MIN;
	cout<<"\nLDBL_MAX = "<<LDBL_MAX;

	/*Number of digits of precision*/
	cout<<"\nFLT_DIG = "<<FLT_DIG;
	cout<<"\nDBL_DIG = "<<DBL_DIG;
	cout<<"\nLDBL_DIG = "<<LDBL_DIG;
	return 0;
}

/*
sizeof(int) = 4
sizeof(long) = 4
sizeof(float) = 4
sizeof(double) = 8       
sizeof(long double) = 16
SCHAR_MIN = -128
SCHAR_MAX = 127
UCHAR_MAX = 255
SHRT_MIN = -32768
SHRT_MAX = 32767
USHRT_MAX = 65535          
INT_MIN = -2147483648
INT_MAX = 2147483647
UINT_MAX = 4294967295
LONG_MIN = -2147483648
LONG_MAX = 2147483647
ULONG_MAX = 4294967295
FLT_MIN = 1.175494e-038
FLT_MAX = 3.402823e+038
DBL_MIN = 2.225074e-308
DBL_MAX = 1.797693e+308
LDBL_MIN = 3.205284e-317
LDBL_MAX = 3.205284e-317
FLT_DIG = 6
DBL_DIG = 15
LDBL_DIG = 18
*/


