#include<iostream>
using namespace std;

class Animal
{
    protected:
        string animalName;
        int age;
    public:
        Animal()
        {
            cout<<"\nAnimal Default Constructor is called";
            this->animalName="NA";
            this->age = 0; 
        }

        Animal(string n,int a)
        {
            cout<<"\nAnimal para Constructor is called";
            animalName=n;
            age=a;
        }
        virtual ~Animal()
        {
            cout<<"\nAnimal deconstructor is called";
        }

        virtual void talk() = 0;


        //Use strcmp function to to compare names of 2 Cat
        // remaining part
};

class Dog : public Animal
{
    public:
        Dog()
        {
            cout<<"\nDog Default Constructor is called"; 
        }

        Dog(string n,int a):Animal(n,a)
        {
            cout<<"\nDog para Constructor is called";
        }
        ~Dog()
        {
            cout<<"\nDog deconstructor is called";
        }

        void talk()
        {
            cout<<"\nBow...Bow...Bow....";
        }
};

class Cat : public Animal
{
    public:
        Cat()
        {
            cout<<"\nCat Default Constructor is called"; 
        }

        Cat(string n,int a):Animal(n,a)
        {
            cout<<"\nCat para Constructor is called";
        }
        ~Cat()
        {
            cout<<"\nCat deconstructor is called";
        }

        void talk()
        {
            cout<<"\nMeow...Meow...Meow....";
        }
};



int main()
{	
	// Animal *animal = new Animal();  //This line should give compile time error "Cant create object of abstract class" 
	
	//My Dog name is Boss & age is 15 months
	Animal *dogPtr = new Dog("Boss", 15);
	dogPtr->talk(); //Every animal has unique way of sound
	delete dogPtr;

	//My cat name is Puppy & she is 3 month old and it is-a Animal
	Cat c1("Puppy", 3);
	Cat c2("Sweety", 4);
	
	//Use strcmp function to to compare names of 2 Cat
	// if(c1 == c2)  
	// 	cout<<"Both are same!"<<endl;
	// else
	// 	cout<<"Both are different!"<<endl;
		
	c1.talk();
}