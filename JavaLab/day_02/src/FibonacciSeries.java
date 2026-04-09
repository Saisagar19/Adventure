import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int term1 = 0;
		int term2 = 1;
		int nth = 0;

		System.out.print(term1 + ",");
		System.out.print(term2);

		for (int i = 3; i <= num; i++) {
			nth = term1 + term2;
			term1 = term2;
			term2 = nth;
			System.out.print("," + nth);
		}
		sc.close();
	}
}
