#include<stdio.h>
#include<limits.h>
int acceptArray()
{
	int size,i;
	int max = INT_MIN;
	printf("Enter Size Of an Array: ");
	scanf("%d", &size);
	int arr[size];
	printf("Enter an Array: ");
	for(i=0;i<size;i++)
	{
		scanf("%d ", &arr[i]);
	}
	printf("Array: ");
	for(i=0;i<size;i++)
	{
		printf(" %d", arr[i]);
	}	
	
	// check array for the largest number
	
	for(i=0; i<size; i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	return max;
}








void Two_D_ArrayAccept()
{
	int size, i, j;
	printf("Enter Size of array for 2D Array ex. [2][2]: ");
	scanf("%d", &size);

	int arr[size][size];
	
	printf("Enter array in 2D Form: ");
	for(i=0; i<size; i++)
	{
		for(j = 0; j<size; j++)
		{
			scanf("%d",&arr[i][j]);
		}
	}
	
	for(i = 0; i<size; i++)
	{
		for(j=0; j<size; j++)
		{
			printf(" %d",arr[i][j]);
		}
		printf("\n");
	}
	
}

int main()
{
	int maxNumber;
	maxNumber = acceptArray();
	printf("\nMax Number: %d", maxNumber);
	
//	Two_D_ArrayAccept();	
	return 0;
}
