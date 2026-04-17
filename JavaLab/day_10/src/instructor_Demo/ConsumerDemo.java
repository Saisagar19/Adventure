package instructor_Demo;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		List<Instructor> l = InstructorDetails.getAll();
		Consumer<Instructor> c = a -> {System.out.println(a);};
		l.forEach(c);
		
		System.out.println("------------");
		//Get names of all instructor
		Consumer<Instructor> c1 = a -> {System.out.print(a.getName()+" ");};
		l.forEach(c1);
		
		System.out.println("\n------------");
		//Get names and gender of all instructor
		Consumer<Instructor> c2 = a -> {System.out.println(a.getGender());};
		l.forEach(c1.andThen(c2));
		
		System.out.println("\n------------");
		//get list of all instructor who teaches online
		l.forEach(x ->{
			if(x.isOnlineCourse())
			{
				c.accept(x);
			}
		});
		
		System.out.println("\n------------");
		//get list of all instructor who teaches online
		l.forEach(x->{
			if(x.isOnlineCourse() && x.getYearOfExperience() > 5)
			{
				c.accept(x);
			}
		});
			
	}
}
