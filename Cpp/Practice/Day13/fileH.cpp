#include<iostream>
#include<fstream>
using namespace std;



 bool isVowel(char ch)
    {
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
        {
            return true;
        }
        else{

            return false;
        }
    }
int main()
{
    // ofstream file;
    // file.open('test.txt');
    // file<<'Helloo ';
    // file.close();
    // cout<<'File is created';

    char cha;
    ifstream file("test.txt");

    while(!file.eof())
    {
        
        file.get(cha);
        cout<<cha;
    }
    file.close();


   

}