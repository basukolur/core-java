class IndianBank extends Banks{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The Indian Bank ");
         interest = interest + 1.3 ;
   
        super.getInterest(interest);
        
         
     }
}