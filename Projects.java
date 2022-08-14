package projectManagementSystem;

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

	//Constructor
	public Projects(String name, String number, String type, String address,String erf, int fees, int paid, String deadline, Person architect, Person contractor, Person customer) {
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
	}
	
	//Setters
	
	public void setDeadline(String newDeadline) {
		deadline = newDeadline;
	}
	
	public void setPaid(int newPaid) {
		paid = newPaid;
	}
	
	//Getters
	
	public String getName() {
		return name;
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
	
	public String toString() {
		String objectString ="Project" + "\n Name:" + name + "\n Order Number:" + number + 
				"\n Type:" + type + "\n Address:" + address + "\n Erf Number:" + erf +"\n Project fees:" + fees +
				"\n Amount Paid:" + paid + "\n Deadline:" + deadline + "\n";
		return objectString;}
		
	public int toBalance() {
		int outstanding = fees - paid;
		return outstanding;
	
	}
	
	public String toInvoice() {
		String invoice = "Total Amount due by customer " + toBalance();
		return invoice;
}
}


