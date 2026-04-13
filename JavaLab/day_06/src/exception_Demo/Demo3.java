package exception_Demo;

public class Demo3 {
	public static void main(String[] args) {

		int x, y, z = 0;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			z = x / y;
			System.out.println("z = " + z);
		} catch (Throwable e) {
			if (e instanceof ArithmeticException) {
				System.out.println(e);
			} else if (e instanceof NumberFormatException) {
				e.printStackTrace();

			} else if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println(e.getMessage());

			}
		}
	}
}
