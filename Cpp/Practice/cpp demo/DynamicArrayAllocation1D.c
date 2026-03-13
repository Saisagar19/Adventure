#include<stdio.h>
int main()
{
	int *ptr, size, i;
	
	printf("\n Enter size for array: ");
	scanf(" %d", &size);
	ptr = (int *)malloc(sizeof(int) * size);
	//ptr = new int[size];     in cpp
	for(i = 0; i<size;i++)
	{
		ptr[i] = 10+i; 
	}
	
	for(i = 0; i < size; i++)
	{
		printf("\n &ptr[%d] = %d", i, &ptr[i]);
		printf(" Value = %d", ptr[i]);
	}
}
