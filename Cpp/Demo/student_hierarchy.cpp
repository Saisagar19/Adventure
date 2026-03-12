#include<iostream>
#include<cstring>
using namespace std;

class student
  {      
    protected:
        int student_id;
        char *name;
        int age;
        float Theory_marks;
    public:

    student()
    {
        cout<<"Default constructor";
    }
    student(int sid, const char *n, int a, float tm)
    {
        student_id=sid;
        name = new char[strlen(n)+1];
        age =a;
        Theory_marks = tm;
        cout<<"para constructor";
    }

    ~student()
    {
        delete name;
    }
    void display()
    {
        cout<<"Student id: "<<student_id;
        cout<<"Name: "<<name;
        cout<<"Age: "<<age;
        cout<<"Theory_marks: "<<Theory_marks;
    }

    virtual void conductExam()
    {

    }
    virtual float calTotal()=0;
    //  constructors - default and parameterized,  destructor,  display, 
    //  conductExam     -  make this function pure virtual function
    //  float calTotal   -  make this function pure virtual function, will return total marks 
  };
   class sportStudent : public student
  { 
    protected:     
    char *sportName; //like Cricket,Basketball,Football,etc.
    int creadits
   public:
    //   constructors - default, parameterized,  destructor,  display
    //   override conductExam which displays "Theory Exam and physical activity needs to be done"
    //  override  float calTotal, give 10 marks per credit   
  };


