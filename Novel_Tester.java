class Novel_Tester{
	public static void main(String[] args){
		
		Novel_DTO novel = new Novel_DTO();
		
		novel.setNovelName("Yaana");
		novel.setPrice(200.00);
		novel.setAuthor("S L Bhairappa");
		novel.setPages(218);
		novel.setPublisher("Sahitya Bhandar");
		System.out.println(novel.getNovelName()+" "+novel.getPrice()+" "+novel.getAuthor()+" "+novel.getPages()+" "+novel.getPublisher());
		
	}
}