package treePractice;

import java.util.Comparator;

public class Mycomparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		String cm1 = e1.getName().toLowerCase(); 
		String cm2 = e2.getName().toLowerCase();
		if (cm1.charAt(0) > cm2.charAt(0)) 
			{
				return +1;
			} else if (cm1.charAt(0) < cm2.charAt(0)) 
			{
				return -1;
			} else {
				for (int i = 0; i < Math.max(cm1.length(), cm1.length()); i++) {
					if (cm1.charAt(i) > cm2.charAt(i)) {
						return +1;
					}
				}
				return 0;
			}
		
		//Descending order
//		if (cm1.charAt(0) < cm2.charAt(0)) 
//		{
//			return +1;
//		} else if (cm1.charAt(0) > cm2.charAt(0)) 
//		{
//			return -1;
//		} else {
//			for (int i = 0; i < Math.max(cm1.length(), cm1.length()); i++) {
//				if (cm1.charAt(i) < cm2.charAt(i)) {
//					return +1;
//				}
//			}
//			return 0;
//		}

	}
}
