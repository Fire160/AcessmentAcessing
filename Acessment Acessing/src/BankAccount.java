public class BankAccount
	{
 	protected double myBalance;
 	public BankAccount ()
 		{ 
 		myBalance = 0;
 		}
 	public BankAccount(double balance)
 		{
 		myBalance = balance;
 		}
 	public void deposit(double amount)
 		{ 
 		myBalance += amount;
 		}
 	public void withdraw(double amount)
 		{
 		myBalance -= amount;
 		}
	public double getBalance( )
		{ 
		return myBalance;
		}
	}