package array_List;
import java.util.ArrayList;

public class ArrayListDemoCRUD {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		// ADD 
		System.out.println("ADD\n");
		a.add("Demon");
		a.add("Devil");
		a.add("Necro");
		a.add("Light Yagami");
		a.add("JJK");
		System.out.println(a);

		System.out.println("\nDisplay Data");
		System.out.println();
		// DISPLAY Data
		for (String s : a) {
			System.out.println(s);
		}
		System.out.println("\nUpdate Data\n");
		// UPDATE Data
		a.set(3, "Fame");
		System.out.println(a);

		// Delete Data
		System.out.println("\nDelete Data\n");
		a.remove(3);
		System.out.println(a);
		
		

	}
}