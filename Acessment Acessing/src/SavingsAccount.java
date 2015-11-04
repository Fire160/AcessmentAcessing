public class SavingsAccount extends BankAccount
	{
	public double myInterestRate;
	public SavingsAccount()
		{
		/* implementation not shown */ 
		}
	public SavingsAccount(double balance, double rate)
		{
		myBalance = balance;
		myInterestRate = rate;
		}
	public void addInterest() 
		{
		myInterestRate++;
		}
	public double getInterest()
		{
		return myInterestRate;
		}
	}
