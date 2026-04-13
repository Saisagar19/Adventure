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
			int count = 0;
			String sent = "";
			while ((i = fi.read()) != -1) 
			{
				sent += (char)i;
				for(int j = 0; j < vowels.length; j++)
				{
					if((char)i == vowels[j])
					{
						count++;
						System.out.println("vowels: "+(char)i+" Count: "+count);
					}
				}
			}
			System.out.println(sent);
			
//			System.out.println("Count of vowels: "+count);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
//			System.out.println("\n Release Resource");
			fi.close();
		}
	}
}
