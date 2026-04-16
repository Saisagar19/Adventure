package assign1;
import java.util.Scanner;

public class Max_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number num2: ");
		int num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is Max Number");
		}
		else
		{
			System.out.println(num2+" is Max Number");
		}
		sc.close();
	}
}

