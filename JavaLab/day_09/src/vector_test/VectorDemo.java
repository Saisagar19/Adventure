package vector_test;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		Vector<Integer> vec = new Vector<Integer>(10, 5);
//		Vector<Integer> vec = new Vector<Integer>();
		System.out.println(vec.capacity());
//		vec.add(10);
//		vec.add(null);
//		vec.add(null);
//		System.out.println(vec);
//		System.out.println(vec.capacity());
		for (int i = 0; i < 10; i++) {
			vec.addElement(i);
		}
		System.out.println(vec);
		vec.add(11);
		System.out.println(vec);
		System.out.println("Size of vector: "+vec.size());
//		System.out.println("Previous capacity: "+vec.capacity());
//		System.out.println(vec.remove(0));
//		System.out.println(vec);
//		System.out.println("After removing an element capacity: "+vec.capacity());

		Enumeration<Integer> e = vec.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement());
		}
	}
}
