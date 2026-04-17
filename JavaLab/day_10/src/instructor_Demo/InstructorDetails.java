package instructor_Demo;

import java.util.Arrays;
import java.util.List;

public class InstructorDetails {
	public static List<Instructor> getAll()
	{
		Instructor i1 = new Instructor("Sahil", 23, "Male", false, "Trainee", 0, Arrays.asList("c", "c++", ".net"));
		Instructor i2 = new Instructor("Priya", 28, "Female", true, "Senior Developer", 5, Arrays.asList("Java", "Spring Boot", "Hibernate"));
		Instructor i3 = new Instructor("Amit", 45, "Male", true, "Architect", 10, Arrays.asList("Microservices", "AWS", "Docker"));
		Instructor i4 = new Instructor("sagar", 24, "Female", false, "Software Engineer", 1, Arrays.asList("Python", "Django", "Flask"));	
		Instructor i5 = new Instructor("Rahul", 56, "Male", true, "DevOps Engineer", 4, Arrays.asList("Kubernetes", "CI/CD", "Linux"));
	
		List<Instructor> list = Arrays.asList(i1,i2,i3,i4,i5);
		
		return list;
	}

}
