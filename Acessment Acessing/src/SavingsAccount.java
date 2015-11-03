public class SavingsAccount extends BankAccount
	{
	public double mylnterestRate;
	private double myInterestRate;
	public SavingsAccount()
		{
		/* implementation not shown */ 
		}
	public SavingsAccount(double balance, double rate)
		{
		myBalance = balance;
		myInterestRate = rate;
		}
	public void addlnterest() 
		{
		myInterestRate++;
		}
	}
