#include<iostream>
using namespace std;

int mystrlen(char*);
char *mystrCopy(char* , char*);
char *concatStr(char*, char*);
int charCount(char *, char);
char *LefttrimStr(char*);
char *mystrCpy(char*, char*);
char *myConcat(char*, char*);
char *toLowerString(char*);
char *toUpperString(char*);
char *reverseString(char*);

int main()
{
	char str1[50] = "Jujutsu Kaisen";
	char str2[50] = "SuPer";
	
	cout<<"To lower: "<<toLowerString(str2);
	cout<<"\nTo Upper: "<<toUpperString(str2);
	
	cout<<"\nReverse string: "<<reverseString(str2);
//	cout<<str1;
//	cout<<"\n";
//	cout<<str2;
//	cout<<"\n";
//
//	cout<<"\nLength of: "<<str1<<" is: "<<mystrlen(str1);
	

//	cout<<"\nString copy from Str2 to Str1: "<<mystrCopy(str1, str2);

//	char str5[100]="Sagar";
//	char str3='a';
//	cout<<"\n\n String char occurence: "<<charCount(str5,str3);

//	cout<<"\nString concatination of Str1 and Str2: "<<concatStr(str1, str2);
//	cout<<"\n----->"<<myConcat(str1,str2);

//	cout<<"\n\nString with space: "<<str5;
//	cout<<"\n\nString without space: "<<LefttrimStr(str5);
	
	return 0;
}

//String length Function
int mystrlen(char * s)
{
	int i,len=0;
	for(i=0;s[i]!='\0';i++)
	{
		len++;	
	}
	return len;	
}

//String Copy function


char *mystrCopy(char *destination, char *source)
{
	int i;
	for(i = 0; source[i]!='\0';i++)
	{
		destination[i]=source[i];
	}
	destination[i]='\0';
	
	return destination;
}

char *concatStr(char *dest, char *sour)
{
	int i,j;
	
	for(i = 0; dest[i] != '\0';i++);
	
	for(j = 0; sour[j] != '\0'; i++, j++)
	{
		dest[i]=sour[j];
	}
	dest[i]='\0';
	
	return dest;
}

// Occurence of character

int charCount(char *str, char target)
{
	int i;
	int len = 0;
	for(i=0; str[i] != '\0'; i++)
	{
		if(str[i] == target)
		{
			len++;
		}
	}
	
	return len;
	
}
// copy to other string
char *mystrCpy(char *dest, char *sour)
{
	char *text = dest;
	while(*dest++ = *sour++);
	return text;
}
// concatination of string
char *myConcat(char *destination, char *source)
{
	char *text = destination;
	while(*destination != '\0') destination++;
	
	while(*destination++ = *source++);
	return text;
}

//char *LefttrimStr(char *str)
//{
//	int i ;
//	for(i = 0; str[i] != '\0';i++)
//	{
////		!= (str[i] >='A' && str[i] <='Z' && str[i] >='a' && str[i] <='z'))
//		if((int)str[i] == 32)  
//		{
//			str[i] = d;
//		}
//	}
//	return str;
//}

char *toLowerString(char *str)
{
	int i;
	for(i = 0; str[i] != '\0';i++)
	{
		if(str[i]>='A' && str[i]<='Z')
		{
			str[i] = str[i] + 32;
		}
	}
	return str;
}

char *toUpperString(char *str)
{
	int i;
	for(i = 0; str[i] != '\0';i++)
	{
		if(str[i]>='a' && str[i]<='z')
		{
			str[i] = str[i] - 32;
		}
	}
	return str;
}

char *reverseString(char* str)
{
	int i,j;
	char t;
	j = mystrlen(str) - 1;
	for(i = 0; i<j;i++)
	{
		t=str[i];
		str[i]=str[j];
		str[j]=t;	
		
		j--;
	}
	return str;
}





