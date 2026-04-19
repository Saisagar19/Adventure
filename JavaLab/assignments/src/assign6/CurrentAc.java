package assign6;

public class CurrentAc extends Account{

private final static double cBalance = 1000;
	
	
	public CurrentAc(long number, String name, double balance, String branch)
	{
		super(number,name,balance,branch);
		if(balance < cBalance)
		{
			System.out.println("Minimum balance required to create account is 1000");
		}
		System.out.println("Current Account is Created......");
	}

	@Override
	public void withdrawal(double debBalance) {
		if(balance - debBalance < cBalance )
		{
			System.out.println("Can not Withdraw, minimum balance must be 1000");
		}
		else
		{
			balance -= debBalance;
			System.out.println("Withdraw Amt: "+debBalance);
		}
		
	}

}
