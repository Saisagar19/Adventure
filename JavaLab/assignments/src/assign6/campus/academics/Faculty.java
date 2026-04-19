package assign6.campus.academics;

import assign6.campus.data.Person;

public class Faculty extends Person {

	private int facultyId;
	private String name;
	private double salary;
	private String branch;

	public Faculty() {
		super();
	}

	public Faculty(String name, int age, String address,int facultyId, double salary, String branch) {
		super(name, age, address);
		this.facultyId = facultyId;
		this.name = name;
		this.salary = salary;
		this.branch = branch;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", name=" + name + ", salary=" + salary + ", branch=" + branch
				+ ", age=" + age + ", address=" + address + "]";
	}

}
