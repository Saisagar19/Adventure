package innerClass;

//Member Inner class
public class Outer { //outer class

	private int no;
	public Outer()
	{
		no = 100;
	}
	
	private class Inner		//Inner Class
	{
		private int n;
		public Inner()
		{
			n = 10;
		}
		public void getMsg()
		{
			System.out.println("no = "+no);
			System.out.println("n = "+n);
		}

	}
	public void callInner()
	{
		Inner i = new Inner();
		i.getMsg();
	}
	public static void main(String[] args) {
		
		Outer o = new Outer();			// Obj creation of outer class
		o.callInner();
		
//		Inner i = o.new Inner();		// obj creation of inner class
	
//		Inner i = new Outer().new Inner();	// obj creation of inner class 
//		i.getMsg();
		
	}
}
