#include <iostream>
using namespace std;
int main()
{
    int arr[2][3][2] = {{{1, 2}, {3, 4}, {5, 6}}, {{7, 1}, {8, 2}, {9, 3}}};
    for (int i = 0; i < 2; i++)
    {
        cout << "Address at [" << i << "]" << arr[i] << endl;
        for (int j = 0; j < 3; j++)
        {
            cout << "Address at : [" << i << "][" << j << "]" << arr[i][j] << endl;
            for (int k = 0; k <2; k++)
            {
                cout << "Address at : [" << i << "][" << j << "][" << k << "]" << &arr[i][j][k] << endl;
            }
        }
    }
    cout<<"Your Arrays Becomes :"<<endl;
    for (int i = 0; i < 2; i++)
    {cout<<endl;

        for (int j = 0; j < 3; j++)
        {
            cout<<endl;
            for (int k = 0; k < 2; k++)
            {
                cout << arr[i][j][k] << " ";
            }
        }
    }
    return 0;
}