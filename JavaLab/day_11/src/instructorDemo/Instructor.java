package instructorDemo;

import java.util.List;

public class Instructor {
	private String name;
	private int age;
	private String gender;
	private boolean isOnlineCourse;
	private String designation;
	private int yearOfExperience;
	private List<String> courses;

	public Instructor() {

	}

	public Instructor(String name, int age, String gender, boolean isOnlineCourse, String designation,
			int yearOfExperience, List<String> courses) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isOnlineCourse = isOnlineCourse;
		this.designation = designation;
		this.yearOfExperience = yearOfExperience;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isOnlineCourse() {
		return isOnlineCourse;
	}

	public void setOnlineCourse(boolean isOnlineCourse) {
		this.isOnlineCourse = isOnlineCourse;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", age=" + age + ", gender=" + gender + ", isOnlineCourse=" + isOnlineCourse
				+ ", designation=" + designation + ", yearOfExperience=" + yearOfExperience + ", courses=" + courses
				+ "]";
	}

}
