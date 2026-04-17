package treePractice;

import java.util.Comparator;

public class Mycomparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		String cm1 = e1.getName().toLowerCase(); 
		String cm2 = e2.getName().toLowerCase();
		// Ascending
		if (cm1.charAt(0) > cm2.charAt(0)) 
			{
				return +1;
			} else if (cm1.charAt(0) < cm2.charAt(0)) 
			{
				return -1;
			} else {
				for (int i = 0; i < Math.max(cm1.length(), cm2.length()); i++) {
					if (cm1.charAt(i) > cm2.charAt(i)) {
						return +1;
					}
					else if (cm1.charAt(i) < cm2.charAt(i)) 
					{
						return -1;
					}
				}
				int i = cm1.compareTo(cm2);
				if(i == 0)
				{
					return Integer.compare(e1.getEmpId(), e2.getEmpId());
				}
				
				return i;
			}
		
		//Descending order
//		if (cm1.charAt(0) < cm2.charAt(0)) 
//		{
//			return +1;
//		} else if (cm1.charAt(0) > cm2.charAt(0)) 
//		{
//			return -1;
//		} else {
//			for (int i = 0; i < Math.max(cm1.length(), cm2.length()); i++) {
//				if (cm1.charAt(i) < cm2.charAt(i)) {
//					return +1;
//				}
//				else if (cm1.charAt(i) > cm2.charAt(i)) 
//				{
//					return -1;
//				}
//			}
//			int i = cm1.compareTo(cm2);
//			if(i == 0)
//			{
//				return Integer.compare(e1.getEmpId(), e2.getEmpId());
//			}
//			
//			return i;
//		}

	}
}
