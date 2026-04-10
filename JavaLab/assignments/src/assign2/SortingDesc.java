package assign2;

import java.util.Scanner;

public class SortingDesc {

	public static void bubbleSort(int []arr)
	{
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		
		
		int[] arr =  new int[size];
		bubbleSort(arr);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
