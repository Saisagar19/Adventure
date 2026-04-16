package assign1;
import java.util.Scanner;

public class Swap {

	public static void swaps(int num1, int num2)
	{
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Number 1: "+num1+" Number 2: "+num2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int n2 = sc.nextInt();
		System.out.println("Swap the provided Numbers: ");
		System.out.println("Number 1: "+n1+" Number 2: "+n2);
		System.out.println("After Swapping");
		Swap.swaps(n1,n2);
		sc.close();
	}
}
