package synchronizationTest;

public class Account {
	int balance;

	public Account() {
		balance = 5000;
	}

	public  void  deposite(int amount) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " Started");
		int temp;
		temp = balance;
		temp += amount;
		System.out.println("Temp= " + temp);
		Thread.sleep(1000);
		balance = temp;
		System.out.println(Thread.currentThread().getName() + " Completed " + balance);
	}

	public int getBalance() {
		return balance;
	}

}
