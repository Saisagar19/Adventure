package recursion;

public class Practice {

	public static int factorial(int num) {
		if (num < 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static int fibo(int range) {
		if (range == 0) {
			return 0;
		} else if (range == 1 || range == 2) {
			return 1;
		}
		return fibo(range - 2) + fibo(range - 1);
	}

	public static void reverseStr(String str) {
		if ((str == null) || (str.length() <= 1)) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			reverseStr(str.substring(0, str.length() - 1));
		}
	}

	public static boolean palindrom(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return palindrom(s.substring(1, s.length() - 1));
		}
		return false;
	}

	public static boolean palindromeStr(int i, String s) {
		if (i >= s.length() / 2) {
			return true;
		}
		if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
			return false;
		}
		return palindromeStr(i + 1, s);
	}

	public static void main(String[] args) {
		int ans = factorial(7);
		System.out.println(ans);
		for (int i = 0; i < 10; i++) {
			System.out.print(fibo(i) + "  ");
		}
		System.out.println();
		reverseStr("sagar");
		System.out.println(palindrom("racecar"));
		System.out.println(palindromeStr(0, "racecar"));
	}

}
