#include <iostream>
using namespace std;

class Practice
{
public:
    void factorial(int num)
    {
        int fact = 1;
        for (int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        cout << "factorial of " << num << " is: " << fact << endl;
    }

    void Fibo(int terms)
    {
        int t1 = 0;
        int t2 = 1;
        int n1;
        cout << t1 << " " << t2 << " ";

        for (int i = 3; i <= terms; i++)
        {
            n1 = t1 + t2;
            cout << n1 << " ";
            t1 = t2;
            t2 = n1;
        }
    }

    bool isPrime(int num)
    {   
        int count=0;

        if(num<=1)
        {
            return false;
        }
        for(int i = 2; i<=num;i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count == 1)
        {
            return true;
        }
        else{
             return false;
        }
    }
};
int main()
{
    Practice p;
    p.factorial(3);
    p.Fibo(7);
    if(p.isPrime(2) == 1)
    {
        cout<<"\nprime";
    }
    else{
        cout<<"\nnot prime";
    }
}