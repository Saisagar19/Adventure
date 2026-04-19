package assign5;

/*Explain the importance of toString() and equals() methods of the Object class and
override them on class Employee(empId,name,salary).
● Create a class for the main method(say XYZ),and accept five employees'
information and store it in an array. Also ensure if entered empId already exists or
not (use equals method).
● Display all employee info using toString method;*/

public class Employee {
	private int empId;
	private String empName;
	private float sal;

	public Employee() {

	}

	public Employee(int empId, String empName, float sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

	public boolean equals(Employee emp) {
		if (this.empId == emp.getEmpId()) {
			System.out.println("Already exists");
			return true;
		}
		return false;

	}

}
