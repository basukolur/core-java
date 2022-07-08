public class PatientDTO{
	public PatientDTO(){
	}
		private int id;
		private String name;
		private String address;
		private Gender gender;
		private long contactNo;
		
		public int getId(){
			return id;
		}
		public void setId(int id){
			this.id = id;
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getAddress(){
			return address;
		}
		public void setAddress(String address){
			this.address = address;
		}
		public Gender getGender(){
			return gender;
		}
		public void setGender(Gender gender){
			this.gender = gender;
		}
		public long getContactNo(){
			return contactNo;
		}
		public void setContactNo(long contactNo){
			this.contactNo = contactNo;
		}
}