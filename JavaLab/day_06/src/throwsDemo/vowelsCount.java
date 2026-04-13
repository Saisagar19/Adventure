package throwsDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class vowelsCount {
	public static void main(String[] args) throws IOException {

		FileInputStream fi = null;

		try {
			fi = new FileInputStream("abc.txt");
			int i = 0;
			char vowels[] = {'a','e','i','o','u','A','E','I','O', 'U'};
			int ind = 0;
			int count = 0;
			while ((i = fi.read()) != -1) 
			{
				if((char)i == vowels[ind++])
				{
					count++;
				}
			}
			System.out.println("Count of vowels: "+count);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
//			System.out.println("\n Release Resource");
			fi.close();
		}
	}
}
