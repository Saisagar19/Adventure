package assign2;

import java.util.Scanner;

public class MathOperation1 {
	
	public void multiply(int n1,int n2)
	{
		int res = n1 * n2;
		System.out.println("Multiplication of two integers: "+res);
	}
	public void multiply(float n1, float n2)
	{
		float res = n1 * n2;
		System.out.println("Multiplication of two float: "+res);
	}
	public void multiply(int... a)
	{
		int res = 1;
		for(int i =0;i < a.length; i++)
		{
			res = a[i] * res;
		}
		for(int s : a)
		{
			System.out.print(s+" ");
		}
		System.out.println("\nMultiplication of given Array is: "+res);
	}
	public void multiply(double n1, int n2)
	{
		double res = n1 * n2;
		System.out.println("Multiplication of two double: "+res);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathOperation1 mp = new MathOperation1();
//		System.out.println("Enter both integer values: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		mp.multiply(num1, num2);
//		System.out.println("Enter one float and one integer value: ");
//		float n1 = sc.nextFloat();
//		float n2 = sc.nextInt();
//		mp.multiply(n1, n2);
//		System.out.println("Enter one double type and one integer values: ");
//		double n01 = sc.nextFloat();
//		int n02 = sc.nextInt();
//		mp.multiply(n01, n02);
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		int []n = new int[size];
		System.out.println("Enter integer array type of values: ");
		for(int i =0;i<n.length;i++)
		{
			n[i] = sc.nextInt();
		}
		mp.multiply(n);
		sc.close();
	}
}
