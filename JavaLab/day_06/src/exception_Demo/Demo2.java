package exception_Demo;

public class Demo2 {
	public static void main(String[] args) {
		int p, q, r = 0;
		try {
			p = Integer.parseInt(args[0]);
			q = Integer.parseInt(args[1]);
			r = p / q;
			System.out.println("r = " + r);
		} catch (ArithmeticException e) {
			System.out.println("Denominator Should not be divisible by zero");
		} catch (NumberFormatException e) {
			System.out.println("Enter only integral Data");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("enter atleast 2 values");
		} catch (Exception e) {
			System.out.println("Error 1");
		} catch (Throwable e) {
			System.out.println("Error 2");
		}
	}
}
