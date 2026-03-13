#include<iostream>
using namespace std;

//class date
//{
//	int dd,mm,yy;
//	int hh,min,ss;	
//	
//public:			
//	void set_date(int d, int m, int y)
//	{
//		dd=d;
//		mm=m;
//		yy=y;
//	}
//	
//	void set_time(int h, int m, int s)
//	{
//		hh=h;
//		min=m;
//		ss=s;
//	}
//	void displayDate()
//	{
//		
//		cout<<""<<this->dd<<"/"<<this->mm<<"/"<<this->yy;
//	}
//	void displayTime()
//	{
//		cout<<""<<hh<<":"<<min<<":"<<ss;
//		
//	}
//	
//};
//
//int main()
//{
//	date d1;
//	d1.set_date(20,03,2026);
//	d1.set_time(12,12,12);
//	d1.displayTime();
//	cout<<"\n";
//	d1.displayDate();
//}



class date
{
	int dd,mm,yy;
	int hh,min,ss;	
	int x,y;
	
public:			
	void set_date(int dd, int mm, int yy)
	{
		cout<<"Address of calling obj: "<<this;
		cout<<"\n";
		this->dd=dd;
		cout<<"\n";
		cout<<&dd;
		cout<<"\n";
		this->mm=mm;
		cout<<"\n";
		cout<<&mm;
		cout<<"\n";
		this->yy=yy;
		cout<<"\n";
		cout<<&yy;
		cout<<"\n";
	}
	
	void set_time(int hh, int mm, int ss)
	{
		
		this->hh=hh;
		this->min=mm;
		this->ss=ss;
	}
	void set_cor(int xx, int yy)
	{
		this->x=xx;
		this->y=yy;
	}
	void displayDate()
	{
		cout<<""<<dd<<"/"<<mm<<"/"<<yy;
	}
	void displayTime()
	{
		cout<<""<<hh<<":"<<min<<":"<<ss;
		
	}
	void displayCor()
	{
		cout<<"("<<x<<", "<<y<<")";	
	}
	
};
 
int main()
{
	date d1;
	cout<<"Address of date: "<<&d1;
	cout<<"\n";
	d1.set_date(20,03,2026);
	d1.set_time(12,12,12);
	d1.set_cor(1,5);
	d1.displayTime();
	cout<<"\n";
	d1.displayDate();
	cout<<"\n";
	d1.displayCor();
}


