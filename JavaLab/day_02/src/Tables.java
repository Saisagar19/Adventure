import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter table number From ");
		int f = sc.nextInt();
		System.out.print("to ");
		int t = sc.nextInt();
		System.out.println("Table From "+f+" to "+t);
		for(int i = f; i <= t; i++)
		{
			System.out.println("Table Of "+i);
			for(int j = 1; j <= 10; j++)
			{
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
		
	}
}
