public class CheckingAccount extends BankAccount
	{
 	private static final double FEE = 2.0;
 	private static final double MIN_BALANCE = 50.0;
 	public CheckingAccount(double balance)
 		{
 		myBalance = balance;
 		}
 		/* FEE of $2 deducted if withdrawal leaves balance less
 		* than MIN_BALANCE. Allows for negative balance. */
 	public void withdraw(double amount)
 		{ 
// 		super.withdraw(amount);
 		myBalance -= amount;
 		System.out.println("YO DAWG");
 		if(myBalance < MIN_BALANCE)
 			{
 			myBalance -= FEE;
 			}
 		}
	}
