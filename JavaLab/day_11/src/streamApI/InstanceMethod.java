package streamApI;

import java.util.Comparator;
import java.util.TreeSet;

public class InstanceMethod {
	public static void main(String[] args) {

		Employee e1 = new Employee(222, "AAditya", 56982.5f);
		Employee e2 = new Employee(111, "Sayalee", 46982.5f);
		Employee e3 = new Employee(555, "Nikita", 36982.5f);
		Employee e4 = new Employee(444, "Aaean", 55982.5f);
		Employee e5 = new Employee(333, "Aaditya", 76982.5f);

		System.out.println("Sorting based on Name if Name is same then shift to Id: ");
		Comparator<Employee> c = Comparator.comparing(Employee::getName).thenComparing(Employee::getEmpId);
		TreeSet<Employee> t = new TreeSet<Employee>(c);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}
