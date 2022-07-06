class TvChannelTester{
	public static void main(String a[]){
		
		TvChannel tc = new TvChannel();
		tc.setChannelName("ABCPL");
		tc.setType("News Channel");
		tc.setStartedIn(2006);
		tc.setLanguage("Kannada");
		
		
		System.out.println(tc.getChannelName()+":"+tc.getType()+":"+tc.getStartedIn()+":"+tc.getLanguage());
		tc.news();
	}
	
	
}