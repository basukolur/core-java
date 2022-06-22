class BookMyMovieTester {

public static void main (String a[]) {
	
	String movies[] = {"Om","Gaalipata","A","Upendra","H2O","Rakta Kanneeru","Paramatma","Yajamana"};
	String snacks[] = {"ColdDrinks", "Biscuits","PopCorn","Kurkure","SweetCorn"};
	
BookMyMovie bookMyMovie = new BookMyMovie("Prasanna",250,movies,100,20,snacks);
    System.out.println("The Name of The Theatre is "+bookMyMovie.theatreName);
bookMyMovie.showTime(20,"Devi","Om");
bookMyMovie.buySnacks("PopCorn",50);
System.out.println("-------------------------------------");

BookMyMovie bookMyMovie1 = new BookMyMovie("Navarang",300,movies,150,15,snacks);
    System.out.println("The Name of The Theatre is "+bookMyMovie1.theatreName);
bookMyMovie.showTime(10,"Raja","A");
bookMyMovie.buySnacks("SweetCorn",30);
System.out.println("-------------------------------------");

BookMyMovie bookMyMovie2 = new BookMyMovie("CinePolis",350,movies,200,25,snacks);
    System.out.println("The Name of The Theatre is "+bookMyMovie2.theatreName);
bookMyMovie.showTime(5,"Kumar","Gaalipata");
bookMyMovie.buySnacks("Kurkure",20);
}
}