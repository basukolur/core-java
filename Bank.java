class Bank { 
    static double amount;
	static double ta;
	//method to get totalAmount();
    public static void main(String a[]){
		
	//System.out.println("Main Mathod Started ");
	deposit(6700.00);
	withdraw(2000.00);
	getTotalAmount();
	
	deposit(5000.00);
	withdraw(3000.00);
	getTotalAmount();
	
	deposit(1300.00);
	withdraw(1000.00);
	getTotalAmount();
	
	deposit(1800.00);
	withdraw(600.00);
	getTotalAmount();
	
	deposit(12000.00);
	withdraw(600.00);
	getTotalAmount();
	
	deposit(22000.00);
	withdraw(1500.00);
	getTotalAmount();
	
	deposit(4500.00);
	withdraw(2400.00);
	getTotalAmount();
	
	deposit(9000.00);
	withdraw(7000.00);
	getTotalAmount();
	
	deposit(6500.00);
	withdraw(3300.00);
	getTotalAmount();
	
	deposit(7500.00);
	withdraw(3500.00);
	getTotalAmount();
	
	//System.out.println("Main Method Ended ");
}
    static void deposit(double amt){
	System.out.println("Invoke deposit()");
	System.out.println("Amount to be deposit : "+amt);
	System.out.println("Amount before deposit : "+amount);
	amount = amount+amt;
	System.out.println("Amount after deposit : "+amount);
	System.out.println("End of deposit()");
	
	}
	
	static void withdraw(double amt){
	System.out.println("Invoke withdraw()");
	System.out.println("Amount to be withdraw : "+amt);
	System.out.println("Amount before withdraw : "+amount);
	amount = amount-amt;
	System.out.println("Amount after withdraw : "+amount);
	System.out.println("End of withdraw()");
	
	}
	static void getTotalAmount(){
		ta = amount;
		System.out.println("Get Total Amount"+ta);
	}
}

