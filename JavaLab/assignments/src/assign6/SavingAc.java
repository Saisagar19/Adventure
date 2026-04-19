package assign6;

public class SavingAc extends Account{
	
	private final static double sBalance = 5000;
	
	
	public SavingAc(long number, String name, double balance, String branch)
	{
		super(number,name,balance,branch);
		if(balance < sBalance)
		{
			System.out.println("Minimum balance required to create account is 5000");
		}
		System.out.println("Saving Account is Created......");
	}

	@Override
	public void withdrawal(double debBalance) {
		if(balance - debBalance < sBalance )
		{
			System.out.println("Can not Withdraw, minimum balance must be 5000");
		}
		else
		{
			balance -= debBalance;
			System.out.println("Withdraw Amt: "+debBalance);
		}
		
	}
	
}
