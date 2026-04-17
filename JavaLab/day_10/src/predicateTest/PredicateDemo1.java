package predicateTest;

import java.util.List;
import java.util.function.Predicate;

import instructor_Demo.Instructor;
import instructor_Demo.InstructorDetails;

public class PredicateDemo1 {
	public static void main(String[] args) {
		List<Instructor> list = InstructorDetails.getAll();
		Predicate<Instructor> p = (z) -> z.isOnlineCourse();

		list.forEach((x)->
		{
			if(p.test(x))
			{
				System.out.println(x.getName());
			}
		});

		Predicate<Instructor> p1 = (i) -> (i.getName().toLowerCase().trim().charAt(0) == 's') && i.getAge() >= 23;
//		Predicate<Instructor> p1 = (i) -> i.getName().startsWith("S") && i.getAge() >= 23;
		list.forEach((x) -> {
			if (p1.test(x)) 
			{
				System.out.println(x.getName() + " " + x.getAge());
			}
		});
	}

}
