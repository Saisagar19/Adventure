package threadDemo;

public class YeildDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			if (i == 2) {
				Thread.yield();
//				try {
//					Thread.sleep(0);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			} else {
//				System.out.println(Thread.currentThread().getState()+" "+i);
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new YeildDemo(), "one");
		Thread t2 = new Thread(new YeildDemo(), "two");
		Thread t3 = new Thread(new YeildDemo(), "three");

		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());

		t1.start();
		t2.start();
		t3.start();

		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());

	}

}
