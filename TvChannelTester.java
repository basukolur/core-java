class TvChannelTester{
	public static void main(String a[]){
		
		TvChannelDTO tc = new TvChannelDTO();
		tc.setChannelName("ABCPL");
		tc.setType("News Channel");
		tc.setStartedIn(2006);
		tc.setLanguage("Kannada");
		
		
		System.out.println(tc.getChannelName()+":"+tc.getType()+":"+tc.getStartedIn()+":"+tc.getLanguage());

	}
}