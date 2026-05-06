package dsa.sorting;

public class Sorting_Algo {

	public static void swap(int arr[], int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			boolean flag = false;
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
					swap(arr, j, j + 1);
					flag = true;
				}
			}
			if (flag == false) {
				break;
			}
		}
	}

	public static void bubbleSortSt(Student[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			boolean flag = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j].getAge() > arr[j + 1].getAge()) {
					Student temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
//					swap(arr, j, j+1);
					flag = true;
				}
			}
			if (flag == false) {
				break;
			}
		}
	}

	public static void selectionSort(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
//				int temp = arr[i];
//				arr[i] = arr[min];
//				arr[min] = temp;
				swap(arr, min, i);
			}
		}
	}

//	public static void insertionSort(int arr[])
//	{
//		int k;
//		for(int i = 0; )
//	}

	public static void selectionSorting(int arr[]) {
		for (int i = 0; i <= arr.length - 2; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
//				int temp = arr[min];
//				arr[min] = arr[i];
//				arr[i] = temp;
				swap(arr, min, i);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 8, 7, 9, 1, 2, 6 };
//		bubbleSort(arr);
//		selectionSort(arr); 
		selectionSorting(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void mergeV1(int arr1[], int arr2[], int tar[]) {
		int i=0;
		int k = 0;
		int j =0;
		while ((i < arr1.length) && (j < arr2.length)) {
			if(arr1[i] < arr2[j])
			{
				 
			}
		}
	}

}
