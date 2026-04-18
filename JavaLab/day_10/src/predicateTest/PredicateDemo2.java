package predicateTest;

import java.util.List;
import java.util.function.Predicate;

import instructor_Demo.Instructor;
import instructor_Demo.InstructorDetails;

public class PredicateDemo2 {
	public static void main(String[] args) {
		List<Instructor> list = InstructorDetails.getAll();
		Predicate<Instructor> p =  (z) -> z.isOnlineCourse();

		list.forEach((x)->
		{
			if(p.test(x))
			{
				System.out.println(x.getName()+" "+x.isOnlineCourse()+" "+x.getCourses());
			}
		});

	}

}
