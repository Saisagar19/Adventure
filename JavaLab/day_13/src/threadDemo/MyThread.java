package threadDemo;

public class MyThread extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" started");
		for(int i = 1; i <= 4;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+"Entered in loop" );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
