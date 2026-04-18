package regexPattern;

import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
//		String str = "Hi Guys Whats going on ";
//		String s[] = str.split("\\s");
//		
//		for(String st: s)
//		{
//			System.out.println(st);
//		}
	 
		
		String s1 = "55,56,88,99,102";
		String sr[] = s1.split(","); //{"55","56","88","99","102"}
		
		int sum = 0;
		for(int i = 0; i < sr.length; i++)
		{
			sum +=Integer.parseInt(sr[i]);
		}
		System.out.println(sum);
		
		System.out.println(Pattern.matches(".ava", "java"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{1,8}", "Sagar19"));
	}
}
