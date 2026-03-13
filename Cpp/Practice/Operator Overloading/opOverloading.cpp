#include <iostream>
using namespace std;

class Demo
{
    int a;

public:
    void SetData()
    {
        cout << "Enter a no: ";
        cin >> a;
    }
    int getData()
    {
        return a;
    }

    Demo operator+(Demo d)
    {
        Demo c;
        c.a = a + d.a;
        return c;
    }

    void operator=(Demo d)
    {
        a = d.a;
    }
    void operator+=(Demo d)
    {
        a = a + d.a;
    }
    void operator-=(Demo d)
    {
        a = a - d.a;
    }
    void operator*=(Demo &d)
    {
        a = a * d.a;
    }
    void operator/=(Demo &d)
    {
        a = a / d.a;
    }

    bool operator==(const Demo &dd)
    {
        return a == dd.a;
        
    }

};
int main()
{
    Demo aa, bb, cc;
    aa.SetData();
    bb.SetData();

    cc = aa + bb;
    cout<<cc.getData();
    // cout<< "\n";
    // cout<<"b value before assignment: "<<bb.getData();
    // cout<< "\n";
    // bb=aa;
    // cout<<"b value after assignment =: "<<bb.getData();
    // cout<< "\n";
    // bb += aa;
    // cout<<"b value after assignment +=: "<<bb.getData();
    // cout<< "\n";
    // bb -= aa;
    // cout<<"b value after assignment -=: "<<bb.getData();
    // cout<< "\n";
    // bb /= aa;
    // cout<<"b value after assignment /=: "<<bb.getData();
    // cout<< "\n";
    // bb *= aa;
    // cout<<"b value after assignment *=: "<<bb.getData();

    if(aa==bb)
    {
        cout<<"\nHello";
    }
    else
    {
        cout<<"\nbye";
    }

    return 0;
}