class BanksTester {
	public static void main(String a[]){
		
	  Banks kvgb = new KVGB();
	  kvgb.getInterest(3.0);
	  
	  Banks kbl = new KBLBank();
	  kbl.getInterest(5.0);
	  
	  Banks sbi  = new SBI();
	  sbi.getInterest(4.2);
	  
	  Banks icici = new ICICI();
	  icici.getInterest(5.2);
	  
	  Banks indian = new IndianBank();
	  indian.getInterest(4.7);
	  
	  Banks canara = new CanaraBank();
	  canara.getInterest(4.4);
	  
	  Banks hdfc = new HDFCBank();
	  hdfc.getInterest(4.5);
	  
	  Banks vijaya = new VijayaBank();
	  vijaya.getInterest(4.6);
	  
	}
	
}