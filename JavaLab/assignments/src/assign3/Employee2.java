package assign3;

public class Employee2 {
	private static int empNo;
	private float salary;
	private static float totalSalary;

	static {
		empNo = 0;
		totalSalary = 0;
	}

	public Employee2(float salary) {
		empNo++;
		this.salary = salary;
		totalSalary += salary;
	}

	public static void display() {
		System.out.println("EmpNo: " + empNo + " TotalSalary: " + totalSalary);
	}

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(50870);
		Employee2.display();
		Employee2 e2 = new Employee2(70250);
		Employee2.display();
		Employee2 e3 = new Employee2(90440);
		Employee2.display();
		Employee2 e4 = new Employee2(70450);
		Employee2.display();
		Employee2 e5 = new Employee2(70044);
		Employee2.display();

	}

}
