package projectManagementSystem;

public class Person {

	//Attribute
	private String name;
	private String phone ;
	private String email ;
	private String address ;

	//Constructor 
	
	public Person ( String name, String phone, String email, String address) {
		this.name = name;
		this.phone = phone; 
		this.email = email ;
		this.address = address ;
	}
	
	//Setters

	public void setName (String newName) {
		name = newName;
	}
		
	public void setPhone(String newPhone) {
		phone = newPhone;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	//Getters	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	//Methods
	
	public String toString() {
		String objectString =
				" Name:" + name +
				"\n Phone:" + phone +
				"\n Address:" + address +
				"\n Email:" + email;
		
		return objectString;
				
	}
}
