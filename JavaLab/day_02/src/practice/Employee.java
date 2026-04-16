package practice;

public class Employee {
	private int empId;
	private String empName;
	private float empSal;

	public Employee() {
		System.out.println("Defult constructor ");
		empId = 101;
		empName = "Saisagar";
		empSal = 56998.56f;
	}

	public Employee(int id, String en, float sal) {
		System.out.println("Parameterize Constructor :");
		empId = id;
		empName = en;
		empSal = sal;
	}

	public String toString() {
		String s = "Employee = [" + empId + " " + empName + " " + empSal + "]";
		return s;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);

		Employee e1 = new Employee(2, "Necro", 808056.12f);
		System.out.println(e1);
	}
}
