package innerClass;

public class Outer5 {
	
	private int no;
	public Outer5()
	{
		no = 100;
	}
	
	private class Inner5	//Inner Class
	{
		private int n;
		public Inner5()
		{
			n = 10;
		}
		public void getMsg()
		{
			System.out.println("no = "+no);
			System.out.println("n = "+n);
		}
		public static void main(String[] args) {
			Inner5 i = new Outer5().new Inner5();
			i.getMsg();
		}
	}
}
