
public class Runner
	{
	public static void main(String[] args)
		{
		BankAccount myMoney = new CheckingAccount(243.0);
		myMoney.withdraw(200.0);
		System.out.println(myMoney.getBalance());
		}
	}
