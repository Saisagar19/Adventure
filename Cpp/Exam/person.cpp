#include <iostream>
using namespace std;

// Abstract Base Class
class Person
{
protected:
    int person_id;
    string name;
    int age;

public:
    // Default Constructor
    Person()
    {
        person_id = 0;
        name = "Unknown";
        age = 1;
    }

    // Parameterized Constructor
    Person(int id, string nm, int a)
    {
        person_id = id;
        name = nm;
        age = a;
    }

    // Virtual Destructor
    virtual ~Person()
    {
    }

    // Virtual Display Function
    virtual void display()
    {
        cout << "\nPerson ID : " << person_id;
        cout << "\nName      : " << name;
        cout << "\nAge       : " << age;
    }

    // Pure Virtual Function
    virtual void talk() = 0;
};

// Derived Class : Doctor
class Doctor : public Person
{
    string specialization;
    float opd_charges;

public:
    Doctor()
    {
        specialization = "NA";
        opd_charges = 0.0f;
    }

    Doctor(int id, string nm, int a,
           string sp, float charges)
        : Person(id, nm, a)
    {
        specialization = sp;
        opd_charges = charges;
    }

    void display() override
    {
        Person::display();

        cout << "\nSpecialization : " << specialization;
        cout << "\nOPD Charges    : " << opd_charges;
    }

    void talk() override
    {
        cout << "\nI am Dr. " << name
             << ". My specialization is "
             << specialization
             << " and my OPD charges are "
             << opd_charges;
    }
};

// Derived Class : Teacher
class Teacher : public Person
{
    string subject;
    float rate_per_hr;

public:
    Teacher()
    {
        subject = "NA";
        rate_per_hr = 0.0f;
    }

    Teacher(int id, string nm, int a,
            string sub, float rate)
        : Person(id, nm, a)
    {
        subject = sub;
        rate_per_hr = rate;
    }

    void display() override
    {
        Person::display();

        cout << "\nSubject         : " << subject;
        cout << "\nRate Per Hour   : " << rate_per_hr;
    }

    void talk() override
    {
        cout << "\nI am a teacher.";
        cout << "\nI teach " << subject;
        cout << "\nI charge " << rate_per_hr
             << " per hour.";
    }
};

// Derived Class : Student
class Student : public Person
{
    string courseName;

public:
    Student()
    {
        courseName = "NA";
    }

    Student(int id, string nm, int a,
            string course)
        : Person(id, nm, a)
    {
        courseName = course;
    }

    void display() override
    {
        Person::display();

        cout << "\nCourse Name : " << courseName;
    }

    void talk() override
    {
        cout << "\nI am a "
             << courseName
             << " student, "
             << age
             << " years old.";
    }
};

int main()
{
    // Polymorphic Call using Base Class Pointer
    Person *p = new Student(12, "Pooja", 23, "PGCP-AC");

    p->display();
    p->talk();

    cout << "\n\n===== Polymorphism using Array of Base Class Pointers =====";

    Person *p1[3];

    p1[0] = new Doctor(12, "Lokesh", 54,
                       "Cardiologist", 1200.00f);

    p1[1] = new Student(10, "Pooja", 20,
                        "BE");

    p1[2] = new Teacher(11, "Savita", 45,
                        "Core Java", 1200.00f);

    for (int i = 0; i < 3; i++)
    {
        cout << "\n\n--------------------------------";

        p1[i]->display();   // Runtime Polymorphism
        p1[i]->talk();      // Runtime Polymorphism
    }

    // Memory Cleanup
    delete p;

    for (int i = 0; i < 3; i++)
    {
        delete p1[i];
    }

    return 0;
}