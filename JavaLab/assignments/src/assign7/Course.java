package assign7;

/*
Q5. College Course Registration (30 Marks)
	Write a Java program to handle course registrations.
	Create a Course class with: String courseCode, String courseName, int maxSeats. (5 Marks)
	Maintain a Map<Course, List<String>> where key = Course, value = list of student names
	registered. (5 Marks)
	Allow students to register for a course until seats are filled. (5 Marks)
	If a course is full, add student to a waiting list (Queue). (5 Marks)
	Display all courses with registered students and waiting list. (5 Marks)
	Display the course which has the highest number of students registered. (5 Marks)
*/public class Course {
	private String courseCode;
	private String courseName;
	private int maxSeats;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseCode, String courseName, int maxSeats) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.maxSeats = maxSeats;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getMaxSeats() {
		return maxSeats;
	}

	public void setMaxSeats(int maxSeats) {
		this.maxSeats = maxSeats;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", maxSeats=" + maxSeats + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Course c)) return false;
		return courseCode.equals(c.courseCode);
	}
	

}
