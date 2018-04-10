
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		
		myAccount.deposit(300000);
		System.out.println(myAccount);
		myAccount.withdraw(250000);
		System.out.println(myAccount);
		

	}

}
