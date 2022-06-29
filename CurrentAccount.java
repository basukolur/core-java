class CurrentAccount extends BankAccount {

  double interestRate;
  int freeTransactions=10;
  int transactionCount;
  double transactionFee;
  double totalTransactionFee;
 
   public CurrentAccount(double interestRate,double transactionFee){
	 this.interestRate=interestRate;
	 this.transactionFee=transactionFee;
	 
   }
   public  void deposit(double amt){
   System.out.println("invoke deposit()");
   System.out.println("amount to be deposit" +amt);
   System.out.println("balance/amount before deposit" +amount);
    amount=amount+amt;
   System.out.println("amount after deposit"+amount);
   System.out.println("end of deposit()");
   transactionCount++;
   }
   public  void withDraw(double amt){
   System.out.println("invoke withDraw()");
   System.out.println("amount to be withDrawn" +amt);
   System.out.println("amount before withDraw" +amount);
    amount= amount-amt;
	if(amount<=0){
		System.out.println("insufficient balance");
	}
	else{
		System.out.println(amount);
	}
   System.out.println("amount after withDraw" +amount);
   System.out.println("end of withDraw()");
    transactionCount++;
   }
   public  double getBalance(){
	   System.out.println("Total amount available in account is:" +amount);
	  
	   return amount;
   }
    public double deductionOfFee(){
	    double totalTransactionFee=0;
	   
	if(transactionCount>freeTransactions){
	   totalTransactionFee=transactionFee*(transactionCount-freeTransactions);
	   amount=amount-totalTransactionFee; 
	   System.out.println("the transaction fee is " +totalTransactionFee);
	   System.out.println("the balance amount after deduction of transaction fee is " +amount);
	}
	else{
		getBalance();
	}
    return totalTransactionFee; 
}
    public double periodicInterest(){
	   double interest = getBalance() * interestRate/100;
	   deposit(interest);  ///as interest is added to the amount so in deposit we add. so usedeposit to add interestto amount
	 return interest;
 }
}