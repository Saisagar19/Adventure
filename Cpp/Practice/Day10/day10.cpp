#include<iostream>
using namespace std;

// class Base
// {
//     protected:
//     int i;
//     public:
//         Base()
//         {
//             cout<<"\nDefault constructor is called";
//             i = 0; 
//         }
//         Base(int n)
//         {
//             cout<<"\n BASE Parametarized Constructor is called";
//             i = n;
//         }
//         ~Base()
//         {
//             cout<<"\nBase Destructor is called";
//         }
//         void display()
//         {
//             cout<<"\n i = "<<i;
//         }

// }; 

// class Derived : public Base
// {
//     protected:
//     int j;
//     public:
//         Derived()
//         {
//             cout<<"\nDefault Constructor is called";
//         }

//         Derived(int n, int m ): Base (n)
//         {
//             cout<<"\nDerived Parametarized Constructor is called";
//             j = m;
//         }

//         ~Derived()
//         {
//             cout<<"\nDerived Destructor is called.";
//         }

//         void display()
//         {
//             cout<<"\nint i = "<<i;
//             cout<<"\nint j = "<<j;
//         }
// };

// int main()
// {
//     Derived obj(100,200);
//     obj.display();
//     return 0;
// }


class Shape{
    public:
        virtual void Display()
        {
            cout<<"Circle shape";
            cout<<"Square shape";
        } 

        void CalArea()
        {
            cout<<"Circle Area";
        }

};

class Circle : public Shape
{
    protected:
        float radius;
    public:
        Circle()
        {
            cout<<"Circle Shape.";
        }
        Circle(int r)
        {
            radius = r;
        }
        ~Circle()
        {
            cout<<"Destructor is called from Circle.";
        }

        void CalArea()
        {
            constexpr int pi = 3.14;
            double area =  pi * radius;
            cout<<"Area of Circle: ";
        }
    
};

int main()
{
    Circle obj;
    Shape *ptr;
    ptr = &obj;
    ptr->Display();
    ptr = new Circle();
    ptr-> CalArea();

}
