package array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeCRUD {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Employee> emp = new ArrayList<Employee>();
//		//Create Operations
//		System.out.println("Enter employee size: ");
//		int size = sc.nextInt();
//		System.out.println("Enter Employee Details: ");
//		for(int i = 0; i < size; i++)
//		{
//			System.out.println("Enter empId: ");
//			int eid = sc.nextInt();
//			System.out.println("Enter Name: ");
//			String nm = sc.next();
//			System.out.println("Enter Salary: ");
//			float sal = sc.nextFloat();
//			
//			emp.add(new Employee(eid,nm,sal));
//		}
//		//Read Data
//		for(Employee e : emp)
//		{
//			System.out.println(e);
//		}
//		
//		System.out.println("Enter empId 1 to Remove Data: ");
//		int rm = sc.nextInt();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Employee> a = new ArrayList<>();

		int choice;

		do {
			System.out.println("1. Create OP-Add Employee");
			System.out.println("2. Read OP-Display Employees");
			System.out.println("3. Update OP-Update Employee");
			System.out.println("4. Delete OP-Remove Employee");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Employee ID: ");
				int empId = s.nextInt();

				System.out.print("Enter Employee Name: ");
				String name = s.next();

				System.out.print("Enter Employee Salary: ");
				int sal = s.nextInt();

				a.add(new Employee(empId, name, sal));
				System.out.println("added");
				break;

			case 2:
				if (a.isEmpty()) {
					System.out.println("No employees found.");
				} else {
					System.out.println("\nEmployee Data:");
					for (int i = 0; i < a.size(); i++) {
						System.out.println(i + " -> " + a.get(i));
					}
				}
				break;

			case 3:
				System.out.print("Enter index to update: ");
				int index = s.nextInt();

				if (index >= 0 && index < a.size()) {
					System.out.print("Enter new ID: ");
					int newId = s.nextInt();

					System.out.print("Enter new Name: ");
					String newName = s.next();

					System.out.print("Enter new Salary: ");
					int newSal = s.nextInt();

					a.set(index, new Employee(newId, newName, newSal));
					System.out.println("Employee Updated!");
				} else {
					System.out.println("Invalid index!");
				}
				break;

			case 4:
				System.out.print("Enter index to remove: ");
				int removeIndex = s.nextInt();

				if (removeIndex >= 0 && removeIndex < a.size()) {
					a.remove(removeIndex);
					System.out.println("Employee Removed!");
				} else {
					System.out.println("Invalid index!");
				}
				break;

			case 5:
				System.out.println("Exiting... ");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 5);

		s.close();
	}
}