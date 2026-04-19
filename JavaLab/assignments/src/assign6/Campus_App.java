package assign6;
import java.util.Scanner;

import assign6.campus.academics.Faculty;
import assign6.campus.academics.Student;
import assign6.campus.accounts.Fees;

public class Campus_App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Faculty[] f = new Faculty[2];
//
//		for (int i = 0; i < f.length; i++) {
//			System.out.println("Enter Name of Faulty");
//			String nm = sc.nextLine();
//			System.out.println("Enter Age of Faulty");
//			int a = sc.nextInt();
//			sc.nextLine();
//			System.out.println("Enter Address of Faulty");
//			String ad = sc.nextLine();
//			System.out.println("Enter Id of Faulty");
//			int id = sc.nextInt();
//			System.out.println("Enter Salary of Faulty");
//			double sal = sc.nextDouble();
//			sc.nextLine();
//			System.out.println("Enter Branch of Faulty");
//			String br = sc.nextLine();
//			System.out.println("------------------------");
//
//			f[i] = new Faculty(nm, a, ad, id, sal, br);
//
//		}
//		for (Faculty fac : f) {
//			System.out.println(fac);
//			;
//		}
//
//		double totalSal = 0;
//		for (Faculty fac : f) {
//			totalSal += fac.getSalary();
//		}
//		System.out.println("Total Salaries Of All Faculties: " + totalSal);

		Fees[] fs = new Fees[2];
		for (int i = 0; i < fs.length; i++) {
			System.out.println("Enter Name of Student");
			String nm = sc.nextLine();
			System.out.println("Enter Age of Student");
			int a = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Address of Student");
			String ad = sc.nextLine();
			System.out.println("Enter RollNo of Student");
			int rno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Branch of Student");
			String br = sc.nextLine();
			System.out.println("Enter Semester of Student");
			String sem = sc.nextLine();
			System.out.println("Enter Amount: ");
			double amt = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Date: ");
			String dt = sc.nextLine();
//			System.out.println("Enter Date: ");
//			int d=sc.nextInt();
//			System.out.println("Enter Year: ");
//			int y=sc.nextInt();
//			System.out.println("Enter Month: ");
//			int m=sc.nextInt();
			
			fs[i]= new Fees(new Student(nm, a,ad,rno,br, sem),amt,dt);
			System.out.println("------------------------");

		}
		for(Fees ft : fs)
		{
			System.out.println(ft);
		}
		double totalFees = 0;
		for (Fees fa : fs) {
			totalFees += fa.getAmount();
		}
		System.out.println("Total Fees Of All Students: " + totalFees);
	}

}
