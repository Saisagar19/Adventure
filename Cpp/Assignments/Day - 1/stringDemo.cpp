#include<iostream>
using namespace std;

int main()
{
    string name1 = "Infoway";
    cout<<"\n name1 = "<<name1;

    string name2;

    name2 = name1 + name1;
    //name2 = "Apple";
    cout<<"\n name2 = "<<name2;

    if(name1 == name2)
        cout<<"\n Equal..";
    else
        cout<<"\n Different..";


    if(name1 < name2)   // works for relational operator
        cout<<"\n name1 is less than name2";
    else
        cout<<"\n name1 is greater than name2";

    //string functions supported in C++

    cout<<"\n Length = "<<name1.length();
    cout<<"\n Size = "<<name1.size();

    cout<<"\n find a character : "<<name1.find('o');

    cout<<"\n find a string :"<<name1.find("way");

    cout<<"\n replace :"<<name1.replace(4,6,"Techno");

    cout<<"\n insert :"<<name1.insert(4,"way ");

    cout<<"\n erase :"<<name1.erase(3,3);

    cout<<"\n 0th index "<<name1[0];

    const char *str = name1.c_str();

    cout<<"\n const char *: "<< str;
    return 0;
}

/*Assignment #2:

  1. Find out if some more functions are supported for string in C++

  2. A Word is said to be Magic Word if it satisfies following properties

       i. The word has at least six characters.
      ii. The word has even number of characters.
     iii. The word has first letter 'Z' or 'z'.
      iv. The word has last and First letter same.
       v. The word has two halves which are same.

     Write a program to take a word from user and print the total number of
     properties the word satisfies.

     Print "MAGIC Word" if word satisfies all the given properties.
*/
