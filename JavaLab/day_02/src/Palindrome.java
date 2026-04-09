import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		int temp = num;
		while(num > 0)
		{
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		if(temp == rev) return true;
		
		return false;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(isPalindrome(num))
		{
			System.out.println(num+ " is a palindrome number");
		}
		else
		{
			System.out.println(num+ " is not a palindrome number");
		}
		sc.close();
	}
}
