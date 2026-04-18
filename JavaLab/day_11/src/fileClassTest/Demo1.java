package fileClassTest;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	File file;

	public Demo1() throws IOException {
		file = new File("data\\pqr.xls");
		
		if (file.exists()) {
			System.out.println("File already Present");
		} else {
			System.out.println(file.createNewFile());
		}
		if (file.canRead()) {
			System.out.println("Read Mode");
		}
		if (file.canWrite()) {
			System.out.println("Write Mode");
		}
		else
		{
			System.out.println("can not Write");
		}
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getCanonicalPath());
//		file.delete();
	}

	public static void main(String[] args) throws IOException {
		Demo1 d = new Demo1();

	}
}
