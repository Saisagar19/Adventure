import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,56,78,11,13,7,8);
		int sum = 0;
		for(int i =0; i<li.size();i++)
		{
			if(li.get(i)%2==0)
			{
				sum += (li.get(i)*2); 
			}
		}
		System.out.println("Sum: "+sum);	
	}
	
}
