package assign1;

public class Person {
	private String name;
	private int age;
	
	public Person()
	{
		this.age = 18;
	}
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "[Name: "+name+" Age: "+age+" ]";
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		Person p1 = new Person("Sagar", 23);
		System.out.println(p1);
	}
}
