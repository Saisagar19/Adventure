#include<iostream>
using namespace std;

class Arr1D
{
    int size;
    int *arr;
    // char *arr;

    public:
    // Arr1D arr;
        Arr1D()
        {
            cout<<"Enter size of array: ";
            cin>>size;
            // arr = new char[size];
            arr = new int[size];

            cout<<"Enter "<<size<<" elements in the array: ";
            for(int i =0;i<size;i++)
            {
                cin>>arr[i];
            }
        }    
        ~Arr1D()
        {
            delete[] arr; 
        }
        void display()
        {
            cout<<"Array elements are: "<<endl;
            for(int i = 0;i<size;i++)
            {
                cout<<arr[i]<<" ";
            }
        }

        int maxElement()
        {
            int max = INT_MIN;
            for(int i = 0;i<size;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            return max;
        }
        int minElement()
        {
            int min = INT_MAX;
            for(int i = 0;i<size;i++)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                }
            }
            return min;
        }

};

int main()
{
    Arr1D arr;
    arr.display();
    cout<<"\n";
    cout<<"Max element From array: "<<arr.maxElement()<<endl;
    cout<<"Min element From array: "<<arr.minElement()<<endl;

}

