package assign1;
import java.util.Scanner;

public class Max_of_3 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Number 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a Number 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter a Number 3: ");
		int num3 = sc.nextInt();
		
//		if(num1>num2 && num1>num3)
//		{
//			System.out.println(num1+" is Max number");
//		}
//		else if(num2>num1 && num2>num3)
//		{
//			System.out.println(num2+" is Max number");
//		}
//		else
//		{
//			System.out.println(num3+" is Max number");
//		}
		
		int max = (num1>num2)? num1 :(num2>num3)? num2: num3;
		System.out.println(max);
		sc.close();
	}
}
