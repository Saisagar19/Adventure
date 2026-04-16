package wrapperDemo;

public class WrapperTest {
	public static void main(String[] args) {
		int no = 10;
		Integer i = new Integer(no); // Boxing
		int n = i.intValue(); // UnBoxing
		
		String str = "555";
		int a = Integer.parseInt(str);

		Integer b = Integer.valueOf(str);
		
		int s = 19;
		Integer d = s;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	
		int m = d;
		System.out.println(m);
	}
}