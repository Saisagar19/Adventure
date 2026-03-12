#include<iostream>
#include<string.h>
using namespace std;

class myString
{
    char *str;
    int len;

    myString()
    {
        cout<<"Default constructor";
        str = new char[2];
        strcpy(str, '\0');
        len = 2;
    }

    myString(char *s)
    {
        cout<<"para constructor";
        str = new char[strlen(s)+1];
        strcpy(str,s);
        len = strlen(s);
    }
    

    myString (const myString &s)
    {
        len = s.len;
        str = new char[strlen(s.str)+1];
        strcpy(str,s.str);

    }
    ~myString()
    {
        cout<<"destructor is called";
        delete[] str;    }
};