import java.util.Scanner;

public class LeapYear {
	
	public static boolean isLeap(int year)
	{
		if(year % 4 == 0 && year % 100 != 0)
		{
			return true;
		}
		else if(year % 400 == 0)
		{
			return true;
		}
		
		return false;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check whether it is leap or not: ");
		int year = sc.nextInt();
		if(isLeap(year))
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
		sc.close();
	}

}
