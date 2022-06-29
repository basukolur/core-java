class AccountTester {

public static void main(String a[]) {

SavingsAccount sa = new SavingsAccount(0.3);
sa.deposit(5000.00);
sa.withdraw(500.00);

double amount = sa.getBalance();
System.out.println("Balance of Existing Account "+amount);

SavingsAccount other = new SavingsAccount(0.3);
sa.transfer(3000.00,other);

double totalAmount = other.getBalance();
System.out.println("Balance of other Account "+totalAmount);

CurrentAccount ca=new CurrentAccount(1.0,2.0);
  System.out.println("Start of Current account method *******************");
  ca.deposit(7000);
  ca.withDraw(200);
   ca.deposit(400);
  ca.withDraw(100);
   ca.deposit(700);
  ca.withDraw(800);
   ca.deposit(100);
  ca.withDraw(200);
   ca.deposit(300);
  ca.withDraw(500);
  ca.deposit(100);
  ca.withDraw(200);
   ca.deposit(300);
  ca.withDraw(500);
    ca.withDraw(200);
   ca.deposit(300);
  ca.withDraw(500);
  ca.deposit(100);
  ca.withDraw(200);
   ca.deposit(300);
  ca.withDraw(500);
    ca.deductionOfFee();

  ca.periodicInterest();
   }
}
