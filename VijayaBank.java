class VijayaBank extends Banks{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The Vijaya Bank ");
         interest = interest + 1.5 ;
   
        super.getInterest(interest);
        
         
     }
}