package synchronizationTest;

public class MyThread2 extends Thread {
	Account a;

	public MyThread2(Account a) {
		super();
		this.a = a;
	}

	public void run() {
		try {
			a.deposite(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
