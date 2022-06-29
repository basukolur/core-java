class KBLBank extends Banks{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The KBL Bank ");
         interest = interest + 1.7 ;
   
        super.getInterest(interest);
        
         
     }
}