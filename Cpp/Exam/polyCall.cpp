#include <iostream>
using namespace std;

class Employee
{
protected:
    int emp_id;
    string emp_name;
    float salary;

public:
    Employee()
    {
        emp_id = 0;
        emp_name = "na";
        salary = 0.00f;
    }

    Employee(int id, string name, float sal)
    {
        emp_id = id;
        emp_name = name;
        salary = sal;
    }

    virtual ~Employee()
    {
    }
    virtual void display()
    {
        cout << "EMP ID: " << emp_id << endl;
        cout << "EMP name: " << emp_name << endl;
        cout << "EMP salary: " << salary << endl;
    }

    virtual void work() = 0;
};

class Manager : public Employee
{
    int teamSize;
    string department;

public:
    Manager()
    {
        teamSize = 0;
        department = "na";
    }

    Manager(int id, string nm, float sal, int teamSize, string department) : Employee(id, nm, sal)
    {
        this->teamSize = teamSize;
        this->department = department;
    }

    ~Manager()
    {
    }

    void display()
    {
        Employee ::display();
        cout << "Team Size " << teamSize << endl;
        cout << "department " << department<< endl;
    }

    void work()
    {
        cout << "Java Developer "<<endl;
    }
};

int main()
{
    Employee *emp = new Manager(101, "sagar", 52000.5f, 50, "IT");

    Employee *arr[2];
    arr[0] = new Manager(101, "sai", 62000.5f, 70, "IT");
    arr[1] = new Manager(106, "om", 2000.5f, 70, "IT");

    for (int i = 0; i < 2; i++)
    {
        cout << "******************************"<<endl;
        arr[i]->display();
        arr[i]->work();
    }

    delete emp;

    for (int i = 0; i < 2; i++)
    {
        delete arr[i];
    }

    return 0;
}