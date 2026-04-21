package threadDemo;

public class ThreadPrio extends Thread {
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadPrio t1 = new ThreadPrio();
		ThreadPrio t2 = new ThreadPrio();
		ThreadPrio t3 = new ThreadPrio();
		
		t2.setPriority(7);
		t3.setPriority(MAX_PRIORITY);
		t1.setPriority(2);
		
		t1.start();
//		t1.join();
		t2.start();
//		t1.join();
		t3.start();
//		t3.join();
		
	}

}
