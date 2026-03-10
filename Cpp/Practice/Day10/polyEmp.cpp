#include<iostream>
using namespace std;

class Emp{
    protected:
    string ename;
    int eno;
    float sal;

    public:
    Emp()
    {
        cout<<"\nEMP Default Contructor...";
        cout<<"\n employee name:"<<"NA";
        cout<<"\n employee number:"<<0;
        cout<<"\n employee Salary:"<<0.00f;
    }

    Emp(string e,int i,float m)
    {
        cout<<"\nEMP Para Contructor...";
        ename=e;
        eno=i;
        sal=m;
        cout<<"\n employee name: "<<ename;
        cout<<"\n employee number: "<<eno;
        cout<<"\n employee Salary: "<<sal;
    }

    virtual ~Emp(){
        cout<<"\nEmp DESTRUCTOR....";
    }
    
    virtual float cal_sal() = 0;

};

class Manager : public Emp
{
    protected:
    int allowance;
    public:
    Manager()
    {
        cout<<"\nManager Constructor...";
    }
    Manager(string e,int i,float m, int a): Emp(e,i,m)
    {
        cout<<"\nManager Para Contructor...";
        allowance = a;
    }
    ~Manager()
    {
        cout<<"\n Manager Destructor Called";
    }

};
class HR : public Manager
{
    protected:
    float target;
    public:
        HR()
        {
            cout<<"\nDefault constructor HR";
        }
        HR(string e,int i,float m, int a, float t): Manager(e, i, m, a)
        {
            cout<<"\npara Default constructor HR";
            target = t;
        }
        ~HR()
        {
            cout<<"\nDestructor of HR";
        }

        float cal_sal()
        {
            float salA;
            salA = sal + allowance + ((float)15/100 * target);
            return salA;
        }
        
};


class Admin : public Emp
{
    protected:
    int allowance;
    public:
    Admin(){
        cout<<"Admin Constructor...";
    }
    ~Admin()
    {
        cout<<"Destructor of Admin Called";
    }

}; class Clerk : public Emp
{
    protected:
    int allowance;
    public:
    Clerk(){
        cout<<"Clerk Constructor...";
    }
    ~Clerk()
    {
        cout<<"Destructor of Clerk Called";
    }

}; 

class Security : public Emp
{
    protected:
    int allowance;
    public:
    Security(){
        cout<<"Security Constructor...";
    }
    ~Security()
    {
        cout<<"\nDestructor of Security Called";
    }

}; 


int main()
{
    Emp *e = new HR("ABC", 1, 25000, 1500, 5000);
    cout<<"\nHR Salary: "<<e->cal_sal();
    delete e;

}