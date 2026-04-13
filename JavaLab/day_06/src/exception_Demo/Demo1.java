package exception_Demo;

public class Demo1 {

	public static void main(String[] args) {
		int p,q,r = 0;
		try 
		{
			p = Integer.parseInt(args[0]);
			q = Integer.parseInt(args[1]);
			r = p/q;
			System.out.println("r = "+r);
		}
		catch(Exception e)
		{
//			System.out.println("Exception occured");
//			System.out.println(e);		//name of exception & description
//			System.out.println(e.getMessage());
			e.printStackTrace(); //name of exception & description and location of code
		}
		
	}
}
