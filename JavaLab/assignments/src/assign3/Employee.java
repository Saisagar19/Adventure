package assign3;

public class Employee {

	private float basicSalary;
	private float DA;
	private float HRA;
	private float GS;
	
	
	public Employee(float basicSalary)
	{
		this.basicSalary = basicSalary;
	}
	public float gsCal()
	{
		
		if(basicSalary < 1500)
		{
			HRA = 0.1f * basicSalary;
			DA = 0.9f * basicSalary;
		}
		else if(basicSalary >= 1500)
		{
			HRA = (float)500;
			DA = 0.98f * basicSalary;
		}
		
		GS = basicSalary + DA + HRA;
		
		return GS; 
		
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee(2500.5f);
		System.out.println("Gross Salary Is: "+e.gsCal());
				
	}
	
	
	
}
