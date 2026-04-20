package assign7.StudentManagementSyst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*Q3. Employee Payroll System (30 Marks)
	Write a Java program to manage employees’ payroll.
	Create an Employee class with: int id, String name, String designation, double salary. (5 Marks)
	Store at least 6 employees in an ArrayList<Employee> and display them. (5 Marks)
	Filter and display employees with salary > 50,000. (5 Marks)
	Sort employees by designation alphabetically using a Comparator. (5 Marks)
	Create a Map<String, Double> showing total salary per designation. (10 Marks)*/
public class TestEmp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Create an Employee class with: int id, String name, String designation, double salary.
		List<Employee> emp = new ArrayList<Employee>();
//		Store at least 6 employees in an ArrayList<Employee> and display them.
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Enter Employee Id: ");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			String nm = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Employee Designation: ");
			String desig = sc.nextLine();
			System.out.println("Enter Employee Salary: ");
			double sal = sc.nextDouble();
			
			emp.add(new Employee(id, nm, desig, sal));
			
		}
//		for(Employee e : emp)
//		{
//			System.out.println(e);
//		}
		emp.stream().forEach(System.out::println);
//		Filter and display employees with salary > 50,000.
		System.out.println("-----------------------------");
		emp.stream().filter(x->x.getSalary()>50000).forEach(System.out::println);
//		Sort employees by designation alphabetically using a Comparator. 
		System.out.println("--------------Sort employees by designation alphabetically using a Comparator--------------");
		emp.stream().sorted(Comparator.comparing(Employee::getDesignation)).forEach(System.out::println);
		System.out.println("-----------------------------");
		double total=emp.stream().map(x->x.getSalary()).reduce(Double::sum).get();
		System.out.println(total);
//		Create a Map<String, Double> showing total salary per designation.
		System.out.println("-------------Map<String, Double> showing total salary per designation---------------");
		Map<String, Double> m = emp.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.summingDouble(Employee::getSalary)));
		System.out.println(m);
	}

}
