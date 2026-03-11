#include<iostream>
using namespace std;

class date
{
    int dd,mm,yy;
    static int cnt;


    public:
        date()
        {
            cout<<"\ndefault con";
            dd=1;
            mm=1;
            yy=2000;
            cnt++; 
        }
        date(int d,int m, int y)
        {
            cout<<"\npara con";
            dd=d;
            mm=m;
            yy=y;
            cnt++; 
        }
        date(int d, int m)
        {
            dd=d;
            mm=m;
            yy=2000;
            cnt++;
        }

        void set_date(int d,int m,int y)
        {
            cout<<"\nThis = "<<this;
            dd = d;
            mm=m;
            yy=y;
        }

        void display()
        {
            cout<<"\nnumber of date object in RAM = "<<cnt;
            cout<<"\n"<< this->dd<<"/"<<this->mm<<"/"<<this->yy;
        }

        ~date()
        {
            cnt--;
        }

        friend ostream &operator<<(ostream& dout, date& m);
};

int date :: cnt =0;

ostream &operator <<(ostream& dout, date& m)
{
    dout<<m.dd<<"/"<<m.mm<<"/"<<m.yy;
    return dout;
}

int main()
{
    date d1,d2(2,5,2002),d3(12,3);

    {
        date d4;
        cout<<d4;
    }

    d1.display();
    d2.display();
    d3.display();

    return 0;
}