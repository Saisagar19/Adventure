package innerClass;

// Anonymous inner class 
public class Outer4 {
	
	public static void main(String[] args) {
		
		Anonymous_call a = new Anonymous_call() {
			@Override
			public void add(int a, int b) {
				System.out.println("Addition: "+(a+b));	
			}
		};
		a.add(75, 25);
		System.out.println(a.getClass());
	}

}
