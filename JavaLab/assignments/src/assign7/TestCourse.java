package assign7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

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
*/
public class TestCourse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Course, List<String>> h = new HashMap<Course, List<String>>();
		Map<Course, Queue<String>> waiting = new HashMap<>();
		h.put(new Course("101", "Java", 5), new ArrayList<>(Arrays.asList("Sagar", "Aaman")));
		h.put(new Course("102", "Python", 10), new ArrayList<>(Arrays.asList("Om", "Ashu", "Swayam")));
		h.put(new Course("103", "Scala", 5), new ArrayList<>(Arrays.asList("Sai", "Jadu", "Sagar", "Ishu", "Sandy")));
		h.put(new Course("104", "C#", 2), new ArrayList<>(Arrays.asList("Sam")));
		h.put(new Course("105", "C++", 4), new ArrayList<>(Arrays.asList("Kaustubh", "Varad")));
		h.put(new Course("106", "Sql", 5), new ArrayList<>(Arrays.asList("Aaditya", "Mayur", "Swayam")));
		
		System.out.println(h.values());
//		Set<Course> id = h.keySet();
//		Iterator<Course> itr = id.iterator();
//		for(Course c : id)
//		{
//			System.out.println(h.get(c));
//		}
	
		for(Course c: h.keySet())
		{
			waiting.put(c, new LinkedList<>());
		}
		
//		Allow students to register for a course until seats are filled. (5 Marks)
//		If a course is full, add student to a waiting list (Queue). (5 Marks)
		System.out.println("Enter course code: ");
		String code = sc.nextLine();
		System.out.println("Enter student name: ");
		String stud = sc.nextLine();
		
		boolean condition = false;
		
		for(Course c : h.keySet())
		{
			if(c.getCourseCode().equals(code))
			{
				if(h.get(c).size() < c.getMaxSeats())
				{
					h.get(c).add(stud);
					System.out.println("Added");
				}
				else
				{
					waiting.get(c).add(stud);
					System.out.println("Added to waiting");
				}
				
				condition = true;
				break;
			}
			
		}
		
		if(!condition)
		{
			System.out.println("course not found");
		}
		
//		Display all courses with registered students and waiting list. (5 Marks)
		for(Course c:h.keySet())
		{
			System.out.println("\nCourse: "+c.getCourseName()+" Registered Student: "+h.get(c)+"Waiting: "+waiting.get(c));
		}
		
//		Display the course which has the highest number of students registered. (5 Marks)
		Course data = null;
		int max = 0;
		for(Course c : h.keySet())
		{
			int len = h.get(c).size();
			if(len > max)
			{
				max = len;
				data = c;
			}
		}
		System.out.println("highest number of students registered "+" Course name: "+data.getCourseName()+" max: "+max);

	}
}
