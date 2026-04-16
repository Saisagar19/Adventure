package assign1;

import java.util.Scanner;

public class CheckEvenOddCode {

	public static boolean checkEven(int num) {
		if (num % 2 == 0)
			return true;
		return false;

	}
	public static boolean checkOdd(int num) {
		if (num % 2 != 0)
			return true;
		return false;

	}
	public static String checkEvenOdd(int num) {
		if (num % 2 == 0) {
			return "Even";
		}
		else
		{
			return "Odd";
		}
			
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println(checkEven(num));
		System.out.println(checkOdd(num));
		System.out.println(checkEvenOdd(num));
		sc.close();
		
	}

}
