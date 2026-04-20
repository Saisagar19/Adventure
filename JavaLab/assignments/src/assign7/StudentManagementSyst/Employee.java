package assign7.StudentManagementSyst;

/*Q3. Employee Payroll System (30 Marks)
	Write a Java program to manage employees’ payroll.
	Create an Employee class with: int id, String name, String designation, double salary. (5 Marks)
	Store at least 6 employees in an ArrayList<Employee> and display them. (5 Marks)
	Filter and display employees with salary > 50,000. (5 Marks)
	Sort employees by designation alphabetically using a Comparator. (5 Marks)
	Create a Map<String, Double> showing total salary per designation. (10 Marks)*/
public class Employee {
	private int id;
	private String name;
	private String designation;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

}
