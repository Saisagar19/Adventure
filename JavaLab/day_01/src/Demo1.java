
public class Demo1 {
	
	public static void main(String[] args) {
		
		byte b = 127;
		int num = 257;
		
		b = (byte) num; // explicit type casting
		System.out.println(b);	
		
		byte b1 = 10;
		byte b2 = 30;
		int n = b1*b2; // implicit type casting
		System.out.println(n);
		
		
		float num1 = 55.5f;
		float avg = (float) 5/2;
		System.out.println(num1);
		System.out.println(avg);
		
//		n = n + 1;
//		n += 1;
//		n++;
		
//		System.out.println(10/0);     // Exception [/ by zero]
//		System.out.println(0.0/0.0);
//		System.out.println(10/0.0); 	// Exception Infinity
		
		int a  = 0b101;
		System.out.println("Binary: " +a); // 0b-> binary
		
		int c = 10;			
		int d = c++;		// first assign then insert
		System.out.println(c+ "  "+d);
		
		int e = 10;			
		int f = ++e;		// first assign then insert
		System.out.println(e+ "  "+f);
	}
}
