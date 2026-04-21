package synchronizationTest;

public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		Account a = new Account();
		MyThread1 t1 = new MyThread1(a);
		MyThread2 t2 = new MyThread2(a);
		t1.start();
		System.out.println(t1.isAlive()+" Hey bro i am aliveee t1");
		t1.join();
//		System.out.println(t1.isAlive()+" good bye buddy t1");
		t2.start();
		System.out.println(t2.isAlive()+" Hey bro i am aliveee t2");
		t2.join();
//		System.out.println(t1.isAlive()+" good bye buddy");
		Thread.sleep(4000);
//		Thread.sleep(2000);
		System.out.println(t1.isAlive()+" good bye buddy");
		System.out.println(t2.isAlive()+" good bye buddy");
		System.out.println(Thread.currentThread().isAlive()+" main is alive");
		System.out.println("Balance : "+a.getBalance());
		System.out.println(Thread.currentThread().isAlive()+" main is dead!!! but i am still alive because gc is not executed");

	}

}
