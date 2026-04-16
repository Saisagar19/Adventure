package array_List;

import java.util.*;

public class EmployeeCRUD {

	public static void main(String[] args) {
		int n;

		ArrayList<Employee> a = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number of Employees you want to insert : ");
		n = s.nextInt();
		Employee e[] = new Employee[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter details for Employee :" + (i + 1));
			System.out.println("Enter Employee Id : ");
			int empId = s.nextInt();

			System.out.println("Enter Employee Name :");
			String name = s.next();

			System.out.println("Enter Employee Sal : ");
			int sal = s.nextInt();

			e[i] = new Employee(empId, name, sal);
			a.add(e[i]);
		}
		
		System.out.println(a);
		
		a.set(3, new Employee(5, "aaa", 200));
		System.out.println(a);
		try{a.remove(3);}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		System.out.println(a);
	}
}