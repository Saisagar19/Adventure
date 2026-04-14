package stringDemo;

public class Demo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb.capacity());
		System.out.println(sb);
//		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 5, "Bye"));
		System.out.println(sb.length());
		
		double d = 10.67954;
		System.out.println(String.format("upto 2 Decimal value %.2f", d));
	}
}
