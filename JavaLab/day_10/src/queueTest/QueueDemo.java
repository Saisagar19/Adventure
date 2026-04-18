package queueTest;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		
		System.out.println(q.size());
//		q.offer(null);
		for(int i =0; i <= 10; i++)
		{
			p.offer(i);
		}
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.peek());
		p.add(19);
		System.out.println(p);
		p.offer(null);	// java.lang.NullPointerException
		
	}

}
