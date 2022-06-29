class ICICI extends Banks{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The ICICI Bank ");
         interest = interest + 1.8 ;
   
        super.getInterest(interest);
        
         
     }
}