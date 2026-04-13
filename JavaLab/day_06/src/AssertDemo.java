import java.util.Scanner;

public class AssertDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age =  sc.nextInt();
		assert age > 18 : "You are not eligible for vote";
		System.out.println("Welcome: "+age);
		sc.close();
	}
}
