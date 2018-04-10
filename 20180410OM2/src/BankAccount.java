
public class BankAccount 
{
	private String owner; //예금주
	private int accountNumber; //계좌번호
	private int balance; //잔고
	
	public void deposit(int account)
	{
		balance += account;
	}
	
	public void withdraw(int account)
	{
		balance -= account;
	}
	
	public String toString()
	{
		return "현재 잔액은 " + balance + "입니다.";
	}
}
