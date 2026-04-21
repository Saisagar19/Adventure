package threadDemo;

public class MyThreadRun implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "
				+Thread.currentThread().getState()+" "
				+Thread.currentThread().getId());
		
	}
	public static void main(String[] args) throws InterruptedException {
		MyThreadRun r1 = new MyThreadRun();
		Thread t1 = new Thread(r1);
		MyThreadRun r2 = new MyThreadRun();
		Thread t2 = new Thread(r2);
		MyThreadRun r3 = new MyThreadRun();
		Thread t3 = new Thread(r3);
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		
//		t1.setName("t1");
//		t2.setName("t2");
//		t3.setName("t3");
		
		t1.start();
//		t1.join();
		t2.start();
//		t1.sleep(100);
		t3.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		
//		Thread.currentThread().wait();
		t1.interrupt();
		System.out.println(t1.getThreadGroup());
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t1.getThreadGroup().getParent().getName());
		
	}
}
