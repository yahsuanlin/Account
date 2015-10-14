public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	//no-arg constructer
	public Account() {
			id = 0;
			balance = 0.0;
			annualInterestRate = 0.0;
		}
	//constructor with specific id and initial balance
	public Account(int newId, double newBalance) {
			id = newId;
			balance = newBalance;
		}
	public	Account(int newId, double newBalance, double newAnnualInterestRate) {
			id = newId;
			balance = newBalance;
			annualInterestRate = newAnnualInterestRate;
		}	
	
	// Mutators
	public void withdraw(double newWithdraw) {
		balance -= newWithdraw;
	}
	
	public void deposit(double newDeposit) {
		balance += newDeposit;
	}
	
	//id accessor
	public int getId() {
		return id;
	}
	//id mutator
	public void setId(int newId) {
		id = newId;
	}
	
	//balance accessor
	public double getBalance() {
		return balance;
	}
	//balance mutator
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	//annualInterestRate accessor
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//annualInterestRate mutator
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}	
	
	//getter
	public double getMonthlyInterest() {
		return balance * (annualInterestRate/12)/100;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}	
}