package assign3;

import java.util.Scanner;

public class SumAvg {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of Array: ");
		int arr[] = new int[10];
		int sum = 0; 
		float avg = 0;
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int d : arr)
		{
			System.out.print(d+ " ");
		}
		for(int i=0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		System.out.println("\nSum of elements: "+sum);
		avg = (float)sum / 10;
		System.out.println("Average of Array Elements: "+avg);
		
	}
}
