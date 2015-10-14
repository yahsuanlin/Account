import java.time.LocalDateTime;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000.00, 4.5);
		System.out.println("Your Account");
		System.out.println("ID: "+ account.getId());
		System.out.println("Balance: $20,000");
		System.out.println("Annual Rate: "+account.getAnnualInterestRate()+"%");	
		
		System.out.println("");
		System.out.println("Withdraw: $2,500");
		account.withdraw(2500);
		System.out.println("Deposit: $3,000");
		account.deposit(3000);		
		System.out.println("Balance: $"+account.getBalance());	
		System.out.println("Monthly Interest: $"+account.getMonthlyInterest());
		
		LocalDateTime dateCreated = LocalDateTime.now();
		System.out.println("Account created time: "+dateCreated);
	}
}