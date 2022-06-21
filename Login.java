class Login 
{
  public static void main (String a[]) 
  {
    long contactNo = login(9036570310L);
	String emailId = login("basuk.xworkz@gmail.com");
	}
  public static long login(long contactNo)
  {
  System.out.println("Contact No: " +contactNo);
  return contactNo;
  }
  public static String login(String emailId)
  {
  System.out.println("Email Id : " +emailId);
  return emailId;
  }
}
