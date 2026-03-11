#include<iostream>
using namespace std;

int main()
{
    int m1,m2,m3,m4,totalPer;
    float per;
    char grd;

    cout<<"\nEnter Marks of students: ";
    cin>>m1;
    cin>>m2;
    cin>>m3;
    cin>>m4;
    totalPer = (m1 + m2 + m3 + m4)/4;

    if(totalPer>85) grd = 'A';
    else if (totalPer>=70) grd = 'B';
    else if(totalPer>=55) grd = 'C';
    else if(totalPer >= 40) grd = 'D';
    else grd = 'E';

    cout<<"\nTotalPer: "<<totalPer;
    cout<<"\nGrade: "<<grd;


}