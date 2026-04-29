package dsa.Recursion;

public class Demo {

	public static int fun(int n) {
		if (1 < n) {
			return n;
		}
		System.out.println("Winding: " + n);
		fun(n + 1);
		return n;
	}

	public static void sumOfN(int i, int n, int sum) {
		if (i > n) {
			System.out.println("Sum Of Natural Number: " + sum);
			return;
		}
		sum += i;
		sumOfN(i + 1, n, sum);
	}

	public static int pow(int n, int p) {
		if (p == 0) {
			return 1;
		}
		return n * pow(n, p - 1);
	}

	public static int revD(int n, int rev) {
		if (n > 0) {
			rev = (rev * 10) + n % 10;
			n = n / 10;
			return revD(n, rev);
		}

		return rev;
	}

	public static void fun1(int n) {
		if (n == 0) {
			return;
		}
		fun2(n);
		System.out.println();
		fun1(n - 1);
	}

	public static void fun2(int n) {
		if (n == 0) {
			return;
		}
		System.out.print("*");
		fun2(n - 1);

	}
	

	public static void main(String[] args) {
//		System.out.println(fun(5000));
//		sumOfN(1, 10, 0);
//		System.out.println("Power Of: " + pow(5, 3));
//		System.out.println("Reverse Of Number: " + revD(1234, 0));
		fun1(5);

	}
}
