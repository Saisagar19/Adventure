package streamApI;

import java.util.function.Function;
import java.util.function.Supplier;

// This is a Constructor reference method which is type of method reference introduced in java 8
public class MyClass {
	String msg;

	public MyClass() {
	}

	public MyClass(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	public static void main(String[] args) {
		Supplier<MyClass> sp = MyClass::new;	// Supplier is a interface
		MyClass myCls = sp.get();	// it has one method that
		myCls.msg = "Sagar";
		System.out.println(myCls.getMsg());
		
		Function<String, MyClass> f = MyClass::new;
		MyClass my = f.apply("Necro");
		System.out.println(my.getMsg());
		
		
	}

}
