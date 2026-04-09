import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Subject 1 Marks: ");
//		int sub1 = sc.nextInt();
//		System.out.println("Enter Subject 2 Marks: ");
//		int sub2 = sc.nextInt();
//		System.out.println("Enter Subject 3 Marks: ");
//		int sub3 = sc.nextInt();
//		System.out.println("Enter Subject 4 Marks: ");
//		int sub4 = sc.nextInt();
//		System.out.println("Enter Subject 5 Marks: ");
//		int sub5 = sc.nextInt();
		int totalSum = 0;
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Enter Subject "+i+" Marks out Of 100: ");
			int marks = sc.nextInt();
			totalSum += marks; 
		}
		float per = ((float)totalSum/500) * 100;
		System.out.println("Percentage Of 5 Subjects are: "+per);
		sc.close();
		
	}
}
