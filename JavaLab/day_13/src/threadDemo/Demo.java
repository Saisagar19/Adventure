package threadDemo;

import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		
		/*
		 * Runnable r = new Runnable() {
		 * 
		 * @Override public void run() { int sum = IntStream.rangeClosed(1, 10).sum();
		 * System.out.println("Sum: "+sum);
		 * 
		 * }};
		 * 
		 * new Thread(r).start();;
		 */
		
		/*
		 * Runnable r = ()->{ int sum = IntStream.rangeClosed(5, 10).sum();
		 * System.out.println("Sum: "+sum); }; new Thread(r).start();
		 */
		
		new Thread(()->{
			int sum = IntStream.rangeClosed(9, 60).sum();
			System.out.println("Sum: "+sum); 
		}).start();
		
				
	}
}
