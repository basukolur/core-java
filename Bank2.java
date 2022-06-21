class Bank2 {
    static double amount;
    public static void main(String a[]){
	System.out.println("Main Mathod Started ");
	withdraw(1500.00);
	withdraw(1200.00);
	System.out.println("Main Method Ended ");
}

    static void withdraw(double amt){
	System.out.println("Invoke withdraw()");
	System.out.println("Amount to be withdraw : "+amt);
	System.out.println("Amount before withdraw : "+amount);
	amount = amount-amt;
	System.out.println("Amount after withdraw : "+amount);
	System.out.println("End of withdraw()");
	
	}
}
