class NewsPaperTester {
	public static void main(String a[]){
		
		NewsPaperDTO news = new NewsPaperDTO();
		
		news.setName("The Hindu");
		news.setPrice(10.00);
		news.setFounder("G. Subramanya Iyer");
		news.setFounded(1878);
		news.setHeadQuarters("Chennai");
		System.out.println(news.getName()+" "+news.getPrice()+" "+news.getFounder()+
		                  " "+news.getFounded()+" "+news.getHeadQuarters());
	  
	}
}