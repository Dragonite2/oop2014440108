
public class BankAccount 
{
	private String owner; //������
	private int accountNumber; //���¹�ȣ
	private int balance; //�ܰ�
	
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
		return "���� �ܾ��� " + balance + "�Դϴ�.";
	}
}
