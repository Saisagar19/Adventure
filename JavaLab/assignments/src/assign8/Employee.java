package assign8;

public class Employee implements Comparable<Employee>{
	public int empId;
	public String name;
	public float sal;

	public Employee() {
	}

	public Employee(int empId, String name, float sal) {
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(this.empId > e.empId)
		{
			return +1;
		}
		else if(this.empId < e.empId)
		{
			return -1;
		}
		else {
			return 0;
		}
	}


}