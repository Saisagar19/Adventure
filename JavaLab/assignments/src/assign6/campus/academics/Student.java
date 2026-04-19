package assign6.campus.academics;

import assign6.campus.data.Person;

public class Student extends Person {
	private int rollNo;
	private String branch;
	private String semester;

	public Student() {}
	
	public Student(String name, int age, String address,int rollNo, String branch, String semester) {
		super(name, age, address);
		this.rollNo = rollNo;
		this.branch = branch;
		this.semester = semester;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", branch=" + branch + ", semester=" + semester + ", name=" + name
				+ ", age=" + age + ", address=" + address + "]";
	}
	
	

}
