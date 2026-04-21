package synchronizationTest;

public class MyThread1 extends Thread {

	Account a;

	public MyThread1(Account a) {
		super();
		this.a = a;
	}

	public void run() {
		try {
			a.deposite(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
