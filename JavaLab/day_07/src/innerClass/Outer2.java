package innerClass;

// Method local Inner class
public class Outer2 {

	private int n;
	public Outer2()
	{
		n = 10;
	}
	public void get()
	{
		int n = 6000;
	
		class Inner2
		{
			private int n;
			
			public Inner2()
			{
				n = 5000;
			}
			
			public int getN(int n)
			{
//				return Outer2.this.n; //Outer member call
//				return this.n; //current class member call
				return n;	//get method n
			}
		}
		Inner2 i = new Inner2();
		System.out.println("n: "+i.getN(i.n));
		System.out.println("n: "+i.getN(n));
		System.out.println("n: "+i.getN(Outer2.this.n));
	}
	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.get();
	}
}
