package assign5;

public abstract class Processor {
	public int data;
	
	public Processor(int data)
	{
		this.data = data;
	}
	public void showData()
	{
		System.out.println("Data: "+data);
	}
	public abstract void process();

}
