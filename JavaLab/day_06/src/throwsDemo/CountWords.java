package throwsDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class CountWords {
	public static void main(String[] args) throws IOException {
//		FileInputStream fi = null;
//		try {
//			fi = new FileInputStream("abc.txt");
//			int i = 0;
//			int count = 0; 
//			while ((i = fi.read()) != -1) {
//				System.out.print((char)i);
//				if(i == 32)
//				{
//					count++;
//				}
//			}
//			System.out.println("\n"+(count + 1));
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		} finally {
//		System.out.println("\n Release Resource");
//			fi.close();
//		}
		
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("abc.txt");
			int i = 0;
			String s = "";
			while ((i = fi.read()) != -1) 
			{
				s += ((char)i);
			}
			String arr[] = s.trim().split("\\s+");
			int countWords = arr.length;
			System.out.println(s);
			System.out.println(countWords);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fi.close();
		}
	}

}
