package assign2;

import java.util.Scanner;

public class Remove_Duplicate {

	public static int RemoveD(int[] arr) {
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter element in the array(Sorted): ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		int count=RemoveD(arr);
		System.out.println("The unique Element in the array are: "+count);
		System.out.print("The unique Element are: ");
		for(int i=0;i<=count-1;i++)
		{
			System.out.print(" "+arr[i]);
		}

	}
}
