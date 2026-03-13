#include<iostream>
#include<cstring>
using namespace std;

class myString
{
    char *name1;
    // char *name2;
    public:
        myString()
        {
            name1 = new char[100];
            name1[0] = '\0';
            // name1=nullptr;
            // name2=nullptr;
        }
        myString(const char *c)
        {
            name1 = new char[strlen(c)+1];
            strcpy(name1,c);
            // name2 = new char[strlen(d)+1];
            // strcpy(name2,d);
        }
        ~myString()
        {
            delete[] name1;
            // delete[] name2;
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

        void operator=(const myString s)        //equal
        {
            char *des = name1;
            char *sou = s.name1;
            while(*sou != '\0')
            {
                *des = *sou;
                des++;
                sou++;
            }
            *des = '\0';
        }

        myString operator+(const myString s)        //concatination
        {
            myString temp;
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
                if(*sou != *des) return false;
                sou++;
                des++;
                
            }
            if(*sou == '\0' && *des == '\0')
                return true;
            else{
                return false;
            }

        }

        void display()
        {
            cout<<name1;
        }

};
int main()
{
    myString str("sagar   ");
    myString str1("devil");
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
    con.display();



}