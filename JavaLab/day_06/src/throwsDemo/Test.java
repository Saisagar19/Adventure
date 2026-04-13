package throwsDemo;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter number:");
		int i = System.in.read();
		System.out.println("i = " + i);
//		System.out.println("i = "+(char)i);
		System.out.println("Hello");
		System.err.println("Error");
	}

}
