class SavingsAccount extends  BankAccount {

double interestRate;
    public SavingsAccount(double interestRate){
	this.interestRate = interestRate;
	}
    public double periodicInterest(){
		double interest = getBalance() * interestRate/100;
		deposit(interest);
		return interest;
	}
}