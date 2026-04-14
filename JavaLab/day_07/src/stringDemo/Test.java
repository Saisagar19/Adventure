package stringDemo;

public class Test {
	public static void main(String[] args) {

		String s1 = "Java";
		System.out.println(s1);
//		s1 = s1.concat(" Programming");
//		System.out.println(s1);

		String s2 = new String("Infoway");
		System.out.println(s2);
		// concat method
		s2 = s2.concat(" Technologies");
		System.out.println(s2);
		// length method
		System.out.println(s2.length());

		String s3 = "java";
		String s4 = " Java";
		String s5 = "Java";

		System.out.println(s1 == s3); // false
		System.out.println(s1 == s4); // false
		System.out.println(s1 == s5); // true
		System.out.println(s3 == s4); // false

		// compareTo Method - it minimizes the ascii value of(s1) first char with ascii
		// value of(s2)
		System.out.println(s1.compareTo(s4));
		// compareToIgnoreCase Method
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.compareTo(s5));
		// charAt Method
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));

		// startsWith method - compares first letter of string
		System.out.println(s1.startsWith(s5));
		// startsWith method - compares last letter of string
		System.out.println(s1.endsWith("a"));
		// contains method - check for char sequence
		System.out.println(s1.contains("av"));
		// equals method - check the inside content of obj
		System.out.println(s1.equals(s3));
		// equals method - check the inside content of obj with ignoring the case
		System.out.println(s1.equalsIgnoreCase(s5));

		// toUpperCase - converts string to upper case
		System.out.println(s1.toUpperCase());
		// toLoweCase - converts string to lower case
		System.out.println(s1.toLowerCase());

		String s6 = "    Java   ";
		System.out.println(s6.length());
		// trim - removes leading and trailing spaces of string
		System.out.println(s6.trim().length());
		// substring - return substring of given length (begin index, end
		// index(exclusive))
		System.out.println(s1.substring(2, s1.length()));
		
		// Reverse String using toCharArray And charAt method
		String s7 = "";
		char [] arr = s1.toCharArray();
		
		for(int i = arr.length - 1; i >= 0; i--)
		{
			s7 +=arr[i];
		}
		System.out.println(s7);
		
		//printing character array using for each loop
		for(char c: arr)
		{
			System.out.print(c+ " ");
		}
	}
}
