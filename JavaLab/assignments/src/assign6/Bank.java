package assign6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Account> acDetails = new ArrayList<Account>();
			
			boolean condition = true;
			while (condition) {
				System.out.println("1.Create Account\n2.Display Account\n3.Deposite\n4.Withdraw\n5.Total Balance\n6.Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					System.out.println("1.Saving 2. Current");
					int type = sc.nextInt();
					System.out.println("Enter Account number: ");
					long num = sc.nextLong();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String nm = sc.nextLine();
					System.out.println("Enter Balance: ");
					double bal = sc.nextDouble();
					sc.nextLine();
					System.out.println("Enter Branch Name: ");
					String br = sc.nextLine();

					if (type == 1) {
						acDetails.add(new SavingAc(num, nm, bal, br));
					} else {
						acDetails.add(new CurrentAc(num, nm, bal, br));
					}
					break;
				}
				case 2:
					System.out.println("Enter Account No: ");
					long ac = sc.nextLong();
					for (Account a : acDetails) {
						if (a.getNumber() == ac) {
							a.display();
						}
					}
					break;

				case 3:
					System.out.println("Enter Account No: ");
					long depAcc = sc.nextLong();
					System.out.println("Enter deposite Ammount: ");
					double depAmt = sc.nextDouble();

					for (Account a : acDetails) {
						if (a.getNumber() == depAcc) {
							a.deposite(depAmt);
						}
					}
					break;
				case 4:
					System.out.println("Enter Account No: ");
					long witAcc = sc.nextLong();
					System.out.println("Enter withdraw Ammount: ");
					double witAmt = sc.nextDouble();

					for (Account a : acDetails) {
						if (a.getNumber() == witAcc) {
							a.withdrawal(witAmt);
							;
						}
					}
					break;

				case 5:
					double total = 0;
					for (Account a : acDetails) {
						total += a.getBalance();
					}
					System.out.println("Total Balance: " + total);
					break;

				case 6:
					condition = false;
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
			}
		}

	}
}
