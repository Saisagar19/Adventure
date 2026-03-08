#include<iostream>
#include<climits>
using namespace std;
int main()
{
    unsigned int var = UINT_MAX;
    cout<<"\n var = "<<var;

    var = var + 1;
    cout<<"\n var = "<<var;

    int ivar = INT_MAX;
    cout<<"\n ivar = "<<ivar;

    ivar = ivar + 1;
    cout<<"\n ivar = "<<ivar;

    return 0;

}
