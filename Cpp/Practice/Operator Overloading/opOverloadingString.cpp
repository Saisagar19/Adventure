#include<iostream>
#include<cstring>
using namespace std;

class myString
{
    char *name1;

    public:
        myString()
        {
            name1 = new char[100];
            name1[0] = '\0';
        
        }
        myString(const char *c)
        {
            name1 = new char[strlen(c)+1];
            strcpy(name1,c);

        }
        ~myString()
        {
            delete[] name1;
        }

        int length()                //length
        {
            int count=0;
            char *temp = name1;
            while(*temp != '\0')
            {
                count++;
                temp++;
            }
            return count;
        }

        myString& operator=(const myString &s)        //equal
        {
            if(this != &s)
            {
                name1 = new char[strlen(s.name1)+1];
                strcpy(name1, s.name1);
            }
            return *this;
        }

        myString operator+(const myString s)        //concatination
        {
            myString temp;
            delete[] temp.name1;
            temp.name1 = new char[strlen(name1) + strlen(s. name1)+1];
            char *d = temp.name1;
            char *des = name1;
            char *sou = s.name1;

            while(*des != '\0')
            {
                *d = *des;
                d++;
                des++;
            }
            while(*sou != '\0')
            {
                *d = *sou;
                d++;
                sou++;
            }
            *d ='\0';
            return temp;
        }

        bool operator==(const myString &s)          //comparison
        {
            char *des = name1;
            char *sou = s.name1;

            while(*sou != '\0' && *des != '\0')
            {
                if(*sou != *des)
                    return false;

                sou++;
                des++;
            }

            return (*sou == '\0' && *des == '\0');
        }

        void display()
        {
            cout<<name1;
        }

};
int main()
{
    myString str("sagar");
    myString str1("sagar");
    // cout<<str.length();
    // str = str1;                 // = operator meaning String Copy  ( = operator )
    cout<<"\n";
    // str.display();
    cout<<"\n";
    myString con = str + str1; 
    con.display();

     if(str == str1)
        cout<<"\nStrings are equal";
    else
        cout<<"\nStrings are not equal";

    return 0;



}