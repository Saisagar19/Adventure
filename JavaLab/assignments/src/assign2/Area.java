package assign2;

import java.util.Scanner;

public class Area {
	private int radius;
	private float area;
	
	public void init(int r)
	{
		radius = r;
	}
	public void calc()
	{
		final float pi = 3.14f;
		area = pi * (radius*radius);
	}
	
	public void display()
	{
		System.out.println("Area of circle: "+area);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		Area a = new Area();
		a.init(r);
		a.calc();
		a.display();
		sc.close();
	}
	
}
