package userDefinedExc;

public class Demo4 {
	public static void main(String[] args) {
		A a = new A();
		double d;
		
		try
		{
			d = a.div(1, 2);
			if(d<1)
			{
				throw new MyException();
			}
			System.out.println("Div: "+d);
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage("Error"));
		}
	}

}
