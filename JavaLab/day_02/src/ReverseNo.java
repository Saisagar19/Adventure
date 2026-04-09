import java.util.Scanner;

public class ReverseNo {

	public static int reverse(int num)
	{
		int rev = 0;
		while(num > 0)
		{
			int rem = num % 10;
			rev = (rev * 10) + rem ;
			num /= 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int rev = reverse(num);
		System.out.println("Reverse number of "+num+" is "+rev);
	}
}
