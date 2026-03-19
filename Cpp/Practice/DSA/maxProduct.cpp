#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int maxProduct(vector<int> &arr)
{
    int n = arr.size();
    sort(arr.begin(),arr.end());

    int op1 = arr[n-1] * arr[n-2] * arr[n-3];
    int op2 = arr[0] * arr[1] * arr[n-1];

    return max(op1,op2);
}
int main()
{
    vector<int> arr ={3,-2,-8,1,4};
    cout<<maxProduct(arr);
    return 0;
}
