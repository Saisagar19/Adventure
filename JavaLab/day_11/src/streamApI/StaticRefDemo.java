package streamApI;

import java.util.List;
import java.util.function.Predicate;

import instructorDemo.Instructor;
import instructorDemo.InstructorDetails;

//This is a Static  method reference which is type of method reference introduced in java 8
public class StaticRefDemo {
	
	public static boolean yrOfExp(Instructor ins)
	{
		if(ins.getYearOfExperience()>=5)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		List<Instructor> li = InstructorDetails.getAll();
		Predicate<Instructor> p = StaticRefDemo::yrOfExp;
		li.forEach((x) -> {
			if(p.test(x))
			{
				System.out.println(x.getName()+" "+x.getYearOfExperience());
			}
		});
	}

}
