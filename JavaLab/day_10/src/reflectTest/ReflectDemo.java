package reflectTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Reflection - gives runtime information about class

public class ReflectDemo {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class cls = Class.forName("treePractice.Employee");
		System.out.println("\nClass Name: " + cls);

		Class supCls = cls.getSuperclass();
		System.out.println("\nSuperClass Name: " + supCls);

		Method[] mt = cls.getMethods();
		System.out.println("\nMethod Names: ");
		for (Method m : mt) {
			System.out.println(m);
		}
		
		Constructor[] con = cls.getConstructors();
		System.out.println("\nConstructor Names: ");
		for (Constructor c : con) {
			System.out.println(c);
		}

		Field[] field = cls.getFields();
		System.out.println("\nField Names: ");
		for (Field f : field) {
			System.out.println(f);
		}

	}

}
