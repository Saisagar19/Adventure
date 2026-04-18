package randomAccFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DemoRandomAcc {
	public static void main(String[] args) throws IOException {

		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;

		try {
			File f1 = new File("data\\info1.txt");
			File f2 = new File("data\\info2.txt");
			if (f1.exists() && f2.exists()) {
				System.out.println("File is present");
			} else {
				System.out.println("File is Created");
				f1.createNewFile();
				f2.createNewFile();
			}
			raf1 = new RandomAccessFile(f1, "r");
			raf2 = new RandomAccessFile(f2, "rw");

			System.out.println(raf1.getFilePointer());
			raf1.seek(5);
			System.out.println(raf1.getFilePointer());

			int x = 0;
			while ((x = raf1.read()) != -1) {

				System.out.println(x);
				raf2.write((char) x);
//				if(x == -1)
//				{
//					continue;
//				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
//			raf1.close();
//			raf2.close();
		}
	}

}
