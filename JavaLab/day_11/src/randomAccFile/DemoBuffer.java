package randomAccFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBuffer {
	public static void main(String[] args) throws IOException {

		String str = null;
//		try (BufferedReader br = new BufferedReader(new FileReader("data\\info1.txt"));
//			BufferedWriter bw = new BufferedWriter(new FileWriter("data\\info2.txt"))) {
//			while ((str = br.readLine()) != null) {
//				System.out.println(str);
//				bw.write(str);
//				bw.newLine();
//			}
//
//		}
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("data\\info1.txt"));
			bw = new BufferedWriter(new FileWriter("data\\info2.txt"));
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				bw.write(str);
				bw.newLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			br.close();
			bw.close();

		}
	}

}
