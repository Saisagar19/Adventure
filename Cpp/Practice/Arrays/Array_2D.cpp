#include<iostream>
using namespace std;

class Arr_2D
{
    int rows, cols;
    int **arr;

    public:
        Arr_2D(int r, int c)
        {   
            rows = r;
            cols = c;

            // cout<<"Enter size of Array in 2D: ";

            arr = new int *[rows];              // memory allocation for rows
            for(int i = 0; i < rows;i++)        
            {   
                arr[i] = new int[cols];           // memory allocation for columns
            }   
        }
        void set2Darr()
        {
            cout<<"Enter 2D array elements: ";
            for(int i =0;i<rows;i++)
            {
                for(int j = 0;j<cols;j++)
                {
                    cin>>arr[i][j];
                }
            }
        }

        void get2Darr()
        {
            cout<<"2D Array Element: "<<endl;
            for(int i = 0; i<rows;i++)
            {
                for(int j = 0; j < cols;j++)
                {
                    cout<<arr[i][j]<<"  ";
                }
                cout<<endl;
            }
        }

        void add(Arr_2D &m1, Arr_2D &m2)            // created two address og obj to store and perform addition on two matrix
        {
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0;j<cols;j++)
                {
                    arr[i][j] = m1.arr[i][j] + m2.arr[i][j];
                }
            }
        }

        Arr_2D operator+(Arr_2D &m)
        {
            Arr_2D temp(rows,cols);

            for(int i = 0 ;i<rows;i++)
            {
                for(int j = 0;j<cols;j++)
                {
                    temp.arr[i][j] = arr[i][j] + m.arr[i][j];
                }
            }
            return temp;
        }

        Arr_2D operator-(Arr_2D &s)
        {
            Arr_2D tem(rows,cols);

            for(int i = 0; i<rows;i++)
            {
                for(int j = 0;j<cols;j++)
                {
                    tem.arr[i][j] = arr[i][j] - s.arr[i][j];
                }
            }

            return tem;

        }
        Arr_2D operator*(Arr_2D &s)
        {
            Arr_2D tem(rows,cols);

            for(int i = 0; i<rows;i++)
            {
                for(int j = 0;j<cols;j++)
                {
                    tem.arr[i][j] = arr[i][j] * s.arr[i][j];
                }
            }

            return tem;

        }

        ~Arr_2D()
        {   
            for(int i=0;i<rows;i++)
            {
                delete[] arr[i];
            }
            delete[] arr;
        }


};

int main()
{
    int r, c;
    cout<<"Enter rows and cols: ";
    cin>>r>>c;

    Arr_2D m1(r,c);
    Arr_2D m2(r,c);
    // Arr_2D m3(r,c);

    cout<<"Enter Matrix m1: "<<endl;
    m1.set2Darr();
    m1.get2Darr();

    cout<<"Enter Matrix m2: "<<endl;
    m2.set2Darr();
    m2.get2Darr();

    // m3.add(m1,m2);
    // cout<<"Added Matrix M3: "<<endl;
    // m3.get2Darr();

    // Arr_2D m4 = m1 + m2;
    // cout<<"Addition of M1 + M2: "<<endl;
    // m4.get2Darr();

    // Arr_2D m5 = m1 - m2;
    // cout<<"Substraction of M1 - M2: "<<endl;
    // m5.get2Darr();

    Arr_2D m6 = m1 * m2;
    cout<<"Substraction of M1 * M2: "<<endl;
    m6.get2Darr();

    

}
