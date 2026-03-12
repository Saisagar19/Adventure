#include<iostream>
using namespace std;

class Hospital
{
    int HospitalId;
    string Hname;

    public:
        Hospital()
        {
            HospitalId = 0;
            Hname="City Hospital";
        }
        Hospital(int Hid, string Hn)
        {
            HospitalId = Hid;
            cout<<"Hospital Id: "<<HospitalId;
            Hname=Hn;
            cout<<"Hospital Name: "<<Hname;
        }

        void Accept()
        {
            cout<<"Enter Hospital Id: ";
            cin>>HospitalId;
            cout<<"Enter Hospital Name: ";
            cin>>Hname;
        }

        void Display()
        {
            cout<<"Hospital Id: "<<HospitalId;
            cout<<"Hospital Name: "<<Hname;
        }
        ~Hospital()
        {

        }
};

class Doctor
{
    int docId;
    int fees[3];
    float avgFees;
    Hospital h;

    public:
        Doctor()
        {
            int sum=0;
            docId=0;
            for(int i = 0;i<3;i++)
            {
                fees[i]=0;
                sum =sum + fees[i];
            }
            avgFees = sum/3;
        }
        Doctor(int id, int f[3],)
        {
            
        }
};