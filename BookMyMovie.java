class BookMyMovie { 

String movies[];
    String theatreName;
    int ticketPrice = 600;
    int totalNoOfTickets;
    int totalTicketPrice;

    String snacks[];
	int noOfSnacks;
	int snacksPrice;
	
public BookMyMovie(String theatreName, int totalNoOfTickets, String movies[], int noOfSnacks, int snacksPrice, String snacks[]){
	 this.theatreName = theatreName;
	 this.totalNoOfTickets = totalNoOfTickets;
	 this.movies = movies;
	 this.noOfSnacks = noOfSnacks;
	 this.snacks = snacks;
System.out.println("BookMyMovie Object is Created");
}

public int showTime(int noOfTickets, String bookedBy, String movieName) {
	int totalTicketPrice = 0;
	System.out.println("The ShowTime Method Started");
	System.out.println("Arg 1 : No of Tickets "+noOfTickets);
	System.out.println("Arg 2 : Booked By "+bookedBy);
	System.out.println("Arg 3 : Movie Name "+movieName);
	
	for(int index = 0; index < movies.length; index++) {
		if(movieName == movies[index]) {
			System.out.println("Movie Name Matched");
			
	    if(noOfTickets < totalNoOfTickets) {
			totalTicketPrice = noOfTickets*ticketPrice;
			totalNoOfTickets = totalNoOfTickets - noOfTickets;
    System.out.println("For Movie : "+movieName +"  Total Price is : " +totalTicketPrice +
                    "  No Of Tickets are That are Remaining : "+totalNoOfTickets +"  Booked By  "+bookedBy);
		}
		else {
			System.out.println("Ista ticket illa...");
		}
		}
		else {
			System.out.println("Movie Not available");
		}
		}
		return totalTicketPrice;
		}
		public int buySnacks(String snackName, int quantity) {
			    int totalSnacksPrice = 0;
				System.out.println("The SnackTime method is Started");
				System.out.println("The SnackName is "+snackName);
				System.out.println("The Quantity of the Snacks "+quantity);

        for(int i=0; i<snacks.length; i++){
			if(snackName == snacks[i]) {
				System.out.println("The Snack is Matched ");
				if(quantity < noOfSnacks) {
					totalSnacksPrice = snacksPrice * quantity;
					noOfSnacks = noOfSnacks - quantity;
					System.out.println("The Snacks name : "+snackName +"  The price of the snacks "+totalSnacksPrice 
					                                  +"  Total no of snacks available in the shop "+noOfSnacks);
			    }
				else {
					System.out.println("Astu Snacks Illa");
				}
			}
			else {
				System.out.println("The Snack is not Available");
			}
			
		}		
		return totalSnacksPrice;	
	}
}