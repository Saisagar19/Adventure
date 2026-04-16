package assign3;

public class Demo {
	public static void main(String[] args) {
		int x = 5;
		int y = 9;
		int z = 5;
		y = x++ + ++x;
		System.out.println(y);
		z = x++ - --y - --x + x++;
		System.out.println(z);
		
		boolean p = true;
		boolean q = false;
		boolean r ;
		r = p && q || !(p||q);
		System.out.println(r);
	
		
	}

}
