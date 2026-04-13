// How Exception occurs
package exception_Demo;


public class Demo {
	public static void msg()
	{
		int a = 10/0;
		System.out.println("No: "+a);
	}
	public static void getMsg()
	{
		msg();
	}
	public static void main(String[] args) {
		Demo.getMsg();
		System.out.println("End of program");
	}
}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at Demo.msg(Demo.java:6)
//at Demo.getMsg(Demo.java:11)
//at Demo.main(Demo.java:14)