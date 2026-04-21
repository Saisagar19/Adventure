package threadDemo;

public class ThreadGrp {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName()+" i.e -> main grp");
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup("Parent");
		g1.setMaxPriority(4);
		System.out.println(g1);
		
		Thread t1 = new Thread(g1,"t1 Thread");
		System.out.println(t1);
		Thread t2 = new Thread(g1,"t2 Thread");
		System.out.println(t2);
		Thread t3 = new Thread(g1,"t3 Thread");
		System.out.println(t3);
		
	}

}
