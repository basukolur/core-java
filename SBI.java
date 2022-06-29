class SBI extends Banks{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The SBI Bank ");
         interest = interest + 2.5 ;
   
        super.getInterest(interest);
        
         
     }
}