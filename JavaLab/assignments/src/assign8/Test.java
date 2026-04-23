package assign8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(222, "AAditya", 56982.5f);
		Employee e2 = new Employee(111, "Sayalee", 46982.5f);
		Employee e3 = new Employee(555, "Nikita", 36982.5f);
		Employee e4 = new Employee(444, "Aaean", 55982.5f);
		Employee e5 = new Employee(333, "Aaditya", 76982.5f);
		
//		TreeSet<Employee> t = new TreeSet<Employee>();
//		ArrayList<Employee> t = new ArrayList<Employee>();
		TreeSet<Employee> t = new TreeSet<Employee>(new Mycomparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
//		Collections.sort(t);
		
//		t.stream().sorted().forEach(System.out::println);
		
		
	}

}
