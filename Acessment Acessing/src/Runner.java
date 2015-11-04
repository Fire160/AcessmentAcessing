
public class Runner
	{
	public static void main(String[] args)
		{
//		BankAccount myMoney = new CheckingAccount(243.0);
//		myMoney.withdraw(200.0);
//		System.out.println(myMoney.getBalance());
		
//		SavingsAccount myMoney = new SavingsAccount(243.0, 2.9);
//		((BankAccount)myMoney).addInterest();
//		System.out.println(myMoney.myInterestRate);
		
		CheckingAccount myMoney = new CheckingAccount(189.0);
		myMoney.withdraw(150.0);
		System.out.println(myMoney.getBalance());
		}
	}
