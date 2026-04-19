package assign5;

import java.util.Scanner;

public class EmpTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp[] = new Employee[5];
		for (int i = 0; i < emp.length; i++) 
		{
			System.out.println("Enter Employee Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name: ");
			String nm = sc.nextLine();
			System.out.println("Enter Employee Salary: ");
			float sal = sc.nextFloat();

			emp[i] = new Employee(id, nm, sal);
		}
		for (Employee e : emp) 
		{
			System.out.println(e);
		}
		sc.close();

	}

}
