package treePractice;

import java.util.Comparator;

public class Mycomparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getName().charAt(0) > e2.getName().charAt(0))
		{
			return +1;
		}
		else if(e1.getName().charAt(0) < e2.getName().charAt(0))
		{
			return -1;
		}
		else
		{
			for(int i = 0; i < Math.max(e1.getName().length(), e1.getName().length()); i++)
			{
				if(e1.getName().charAt(i) < e2.getName().charAt(i))
				{
					return -1;
				}
			}
			return 0;
		}
		
	}

}
