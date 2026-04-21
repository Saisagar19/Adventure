package assign7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> student = new ArrayList<Student>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Student Id: ");
			int id = sc.nextInt();
			System.out.println("Enter Student Name: ");
			String nm = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Student Department: ");
			String dept = sc.nextLine();
			System.out.println("Enter Student Double: ");
			double marks = sc.nextDouble();
			student.add(new Student(id, nm, dept, marks));
		}
//		Display all student records. (5 Marks)
		System.out.println("-----------------");
		for(Student s: student)
		{
			System.out.println(s);
		}
		System.out.println("-----------------");
//		Display only those students who scored more than 60 marks. (5 Marks)
//		for(Student s: student)
//		{
//			if(s.getMarks()>60)
//				System.out.println(s);
//		}
		student.stream().filter(x->x.getMarks()>60).forEach(System.out::println);
//		Sort students by marks in descending order using a Comparator and display the sorted list. (5 Marks)
		System.out.println("-----------------");
		student.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);
//		Create a Map<String, List<Student>> where key = department name and value = list of students belonging to that department, and display this map. (5 Marks)
		System.out.println("-----------------");
		Map<String, List<Student>> m = student.stream().collect(Collectors.groupingBy(Student::getDepartment));
		System.out.println(m);
	}

}
