public class Novel_DTO{
	public Novel_DTO(){
	}
	private String novelName;
    private double price;
    private String author;
    private int pages;
    private String publisher;
	
	public String getNovelName(){
		return novelName;
	}
	public void setNovelName(String novelName){
		this.novelName = novelName;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public int getPages(){
		return pages;
	}
	public void setPages(int pages){
		this.pages = pages;
	}
	public String getPublisher(){
		return publisher;
	}
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
}