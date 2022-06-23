class Factory_{
String name;
long contactNo;

public Factory_(){
	System.out.println("Factory Object Created");
}
public Factory_(String name, long contactNo){
	this();
	this.name = name;
	this.contactNo = contactNo;
}
public static void main(String a[]){
	Factory_ fact = new Factory_("JSW", 9879879879L);
	System.out.println(fact.name+"  "+fact.contactNo);
}
}