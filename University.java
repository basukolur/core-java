class University {
String name;
int noOfDepts;

    public University() {
     this("Rani Channamma University", 20);
	 System.out.println("University Object Created");
    }
	public University(String name, int noOfDepts) {
	this.name = name;
	this.noOfDepts = noOfDepts;
	}
    public static void main(String a[]){
	University univ = new University();
	System.out.println(univ.name+"  "+univ.noOfDepts);
	}
}