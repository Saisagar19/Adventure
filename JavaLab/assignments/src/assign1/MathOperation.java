package assign1;

import java.util.Scanner;

public class MathOperation {
	private int x;
	private int y;
	private int z;
	
	public void init(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void add()
	{
		z = x + y;
		System.out.println("Addition: "+z);
	}
	public void multiply()
	{
		z = x * y;
		System.out.println("Multiplication: "+z);
	}
	public void power()
	{
		z = 1;
		for(int i = 0; i < y; i++)
		{
			z = x * z;
		}
		System.out.println("Power: "+z);
	}
	public void display()
	{
		add();
		multiply();
		power();
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter x : ");
		int x = sc.nextInt();
		System.out.println("Enter y : ");
		int y = sc.nextInt();
		
		MathOperation mo = new MathOperation();
		mo.init(x, y);
		mo.display();
		sc.close();	
	}
}
