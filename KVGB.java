class KVGB extends Banks{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The KVG Bank ");
         interest = interest + 2.9 ;
   
        super.getInterest(interest);
        
         
     }
}