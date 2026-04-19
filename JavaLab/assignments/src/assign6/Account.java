package assign6;

public abstract class Account {
	protected long number;
	protected String name;
	protected double balance;
	protected String branch;

	public Account() {
	}

	public Account(long number, String name, double balance, String branch) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}

	public void deposite(double creBalance) {
		this.balance += creBalance;
		System.out.println("Deposited -> " + creBalance);
	}

	public abstract void withdrawal(double debBalance);
	
	public void display() {
		System.out.println("Account [number=" + number + ", name=" + name + ", balance=" + balance + ", branch=" + branch + "]");
	}

	public double getBalance() {
		return balance;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	

}
