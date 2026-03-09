#include<iostream>
using namespace std;

class Shape{

    public:
        virtual double cal_area()
        {
            return 0.00f;
        }
};

class Circle : public Shape{

    protected:
        int radius;
    public:
        Circle()
        {
            radius = 5;
        }
        Circle(int r)
        {
            radius = r;
        }
        ~Circle()
        {

        }

        double cal_area()
        {
            constexpr int pi = 3.14;
            double area = pi * radius;
            return area;
        }
};


class Square : public Shape{

    protected:
        int side;
    public:
        Square()
        {
            side = 5;
        }
        Square(int s)
        {
            side = s;
        }
        ~Square()
        {

        }

        double cal_area()
        {
            double area = side*side;
            return area;
        }
};


int main()
{
    Circle obj(5);
    Shape *ptr;
    ptr = &obj;
    cout<<ptr->cal_area();

    ptr = new Square(8);
    cout<<"\n"<<ptr->cal_area();

    return 0;    

}