#include<iostream>
using namespace std;

class Base
{
    protected:
        int i;
    public:
        Base()
        {
            cout<<"\nBase Default constructor";
            i = 0;
        }
        Base(int n)
        {
            cout<<"\nBase Parameterized constructor";
            i = n;
        }
        virtual ~Base()
        {
            cout<<"\nBase destructor is called";
        }

        virtual void display()
        {
            cout<<"\nint i ="<<i;
        }
};

class Derived1 : public Base
{
    protected:
        int j;
    public:
        Derived1()
        {
            cout<<"\nDerived1 Default constructor";
            j = 0;
        }
        Derived1(int n, int m):Base(n)
        {
            cout<<"\nDerived1 Parameterized constructor";
            i = n;
            j = m;
        }
        ~Derived1()
        {
            cout<<"\nDerived1 destructor is called";
        }

        void display()
        {
            cout<<"\nint i ="<<i;
            cout<<"\nint j ="<<j;
        }
};

class Derived2 : public Derived1
{
    protected:
        int k;
    public:
        Derived2()
        {
            cout<<"\nDerived2 Default constructor";
            k = 0;
        }
        Derived2(int n, int m, int p): Derived1(n,m)
        {
            cout<<"\nDerived2 Parameterized constructor";
            i = n;
            j = m;
            k = p;
        }
        ~Derived2()
        {
            cout<<"\nDerived2 destructor is called";
        }

        void display()
        {
            cout<<"\nint i ="<<i;
            cout<<"\nint j ="<<j;
            cout<<"\nint k ="<<k;
        }
};

int main()
{
    Derived1 obj;
    Base *ptr;
    ptr = &obj;
    ptr->display();
    ptr = new Derived2();
    ptr->display();

    delete ptr;
    return 0;
}