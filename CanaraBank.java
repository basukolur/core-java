class CanaraBank extends Banks{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The Canara Bank ");
         interest = interest + 3.5 ;
   
        super.getInterest(interest);
        
         
     }
}