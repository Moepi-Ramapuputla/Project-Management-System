package projectManagementSystem;

/** 
*Project represents all information for each project created 
*/
public class Projects {

	//Attributes
	private String name;
	private String number;
	private String type;
	private String address;
	private String erf;
	private int fees;
	private int paid;
	private String deadline;
	private Person architect;
	private Person contractor;
	private Person customer;
	private String completion;

	/** Constructor
	*Constructs and initializes a Project 
	*/
	public Projects(String name, String number, String type, String address,String erf, int fees, int paid, String deadline, Person architect, Person contractor, Person customer,String completion) {
		this.name = name ;
		this.number = number ;
		this.type = type ;
		this.address = address ;
		this.erf = erf ;
		this.fees = fees ;
		this.paid = paid ;
		this.deadline = deadline ;
		this.architect = architect ;
		this.contractor = contractor;
		this.customer = customer;
		this.completion = completion;
	}
	
	//Setters
	
	public void setDeadline(String newDeadline) {
		deadline = newDeadline;
	}
	
	public void setPaid(int newPaid) {
		paid = newPaid;
	}
	
	public void setCompletion(String newCompletion) {
		completion = newCompletion;
	}
	
	
	
	//Getters
	
	public String getName() {
		return name;
	}
	
	public String getCompletion() {
		return completion;
	}
	
	public String getprojNumber() {
		return number;
	}
	
	public String getDeadline() {
		return deadline;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Person getArchitect(){
		return architect;
	}
	
	public Person getContractor(){
		return contractor;
	}
	
	public Person getCustomer(){
		return customer;
	}
	
	//Methods
	/**
	*Prints out the all information in easy to read manner for user 
	*/
	public String toString() {
		String objectString = name  + "," + number + "," + type + "," + address + "," + erf + "," + fees + "," + paid + "," + deadline + "," + completion + "," + architect + "," + contractor + "," + customer +  "\n";
 
		  	    String[] arr = objectString.split(",");	
		  	    
	    			String printInfo ="\n Name:" + arr[0] + "\n Order Number:" + arr[1] + 
					"\n Type:" + arr[2] + "\n Address:" + arr[3] + "\n Erf Number:" + arr[4] +"\n Project fees:" + arr[5] +
					"\n Amount Paid:" + arr[6] + "\n Deadline:" + arr[7] + 
					"\n Architect" +"\n Name:" + arr[9] +"\n Number:" + arr[10] +"\n Email:" + arr[11] +"\n Address:" + arr[12] +
					"\n Contractor" +"\n Name:" + arr[13] +"\n Number:" + arr[14] +"\n Email:" + arr[15] +"\n Address:" + arr[16] +
					"\n Customer" +"\n Name:" + arr[17] +"\n Number:" + arr[18] +"\n Email:" + arr[19] +"\n Address:" + arr[20]				
					+ "\n";  
	    	return printInfo;
	}
	
	public String plainData() {
		String objectString = name  + "," + number + "," + type + "," + address + "," + erf + "," + fees + "," + paid + "," + deadline + "," + completion + "," + architect + "," + contractor + "," + customer +  "\n";
  
	    	return objectString;
	}
	
	
		
	public int getBalance() {
		int outstanding = fees - paid;
		return outstanding;
	
	}
	/** 
	*Calculates and print how much money is due by customer
	*/
	public String toInvoice() {
		String invoice = "Total Amount due by customer " + getBalance();
		return invoice;
}
}


