class Novel_Tester{
	public static void main(String[] args){
		
		Novel_ novel = new Novel_();
		
		novel.setNovelName("Yaana");
		novel.setPrice(200.00);
		novel.setAuthor("S L Bhairappa");
		novel.setPages(218);
		novel.setPublisher("Sahitya Bhandar");
		System.out.println(novel.getNovelName()+" "+novel.getPrice()+" "+novel.getAuthor()+" "+novel.getPages()+" "+novel.getPublisher());
		novel.readingStories();
	}
}