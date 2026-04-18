package regexPattern;

import java.util.StringTokenizer;

public class StringTokenDemo {
	public static void main(String[] args) {
		String str = "Java=Sagar;Mysql=sai";
		StringTokenizer st = new StringTokenizer(str,"=;");
		
//		String c = st.nextToken();
//		String nm = st.nextToken();
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
