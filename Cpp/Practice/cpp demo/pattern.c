#include<stdio.h>
// Pattern 1

void patt1()
{
	int i, j;
	for(i = 0; i<5; i++)
	{
		for(j = 0; j < 5; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	
}

void patt2()
{
	int i, j;
	for(i = 0; i < 5; i++)
	{
		for(j = 0; j <= i; j++)
		{
			printf("*");
		}
		printf("\n");
	}
}

void patt3()
{
	int i, j;
	for(i = 1; i <= 5; i++)
	{
		for(j = 1; j <= i; j++)
		{
			printf("%d", j);
		}
		printf("\n");
	}
}

void patt4()
{
	int i,j;
	for(i = 1; i <= 5; i++)
	{
		for(j = 1; j <= i; j++)
		{
			printf("%d",i);
		}
		printf("\n");
	}
}

void patt5()
{
	int i, j;
	for(i = 1; i <= 5; i++)
	{
		for(j = 5; j >=i; j--)
		{
			printf("*");
		}
		printf("\n");
	}
}

void patt6()
{
	int i,j;
	for(i = 5; i>=1; i--)
	{
		for(j = 1; j <= i; j++)
		{
			printf("%d", j);
		}
		printf("\n");
	}
}

void patt7()
{
	int i,j,k;
	int spcnt=4;
	for(i = 0; i < 5; i++)
	{
		for(j=1; j<=spcnt; j++)
		{
			printf(" ");
		}
		for(j = 0; j < i*2+1; j++)
		{
			printf("*");
		}
		for(j=1; j<=spcnt; j++)
		{
			printf(" ");
		}
		printf("\n");
		spcnt--;
	}
}




int main()
{
	patt1();
	printf("\n\n");
	patt2();
	printf("\n\n");
	patt3();
	printf("\n\n");
	patt4();
	printf("\n\n");
	patt5();
	printf("\n\n");
	patt5();
	printf("\n\n");
	patt6();
	printf("\n\n");
	patt7();
	return 0;
}

// Pattern 2



