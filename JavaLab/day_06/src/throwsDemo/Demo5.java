package throwsDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {

		FileOutputStream fs = new FileOutputStream("abc.txt");
//		FileOutputStream fs = new FileOutputStream("abc.txt", true);
		fs.write(65);
		String str = "Hello Guys I am Saisagar";
		byte[] b = str.getBytes();
		fs.write(b);
		System.out.println("Success");
		fs.close();
	}

}
