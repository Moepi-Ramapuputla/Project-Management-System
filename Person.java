package projectManagementSystem;

/** 
*Project represents all information for each person created 
*/
public class Person {

	//Attribute
	private String name;
	private String phone ;
	private String email ;
	private String address ;

	//Constructor 
	/** Constructor
	*Constructs and initializes a Project 
	*/
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
	/**
	*Prints out the all information for us to use to be able to add to string for existingProjects/completedProjects.txt
	*/
	public String toString() {
		String objectString =
				 name + "," +
				 phone + "," +
				 address + "," +
				 email;
		
		return objectString;
				
	}
	/**
	*Prints out the all information in easy to read manner for user 
	*/
	public String printDetails() {
		String objectDetails = 
		" Name:" + name +
		"\n Phone:" + phone +
		"\n Address:" + address +
		"\n Email:" + email;
		return objectDetails;
	}
}
