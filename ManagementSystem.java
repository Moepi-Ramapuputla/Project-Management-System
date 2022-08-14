package projectManagementSystem;

import java.util.Scanner;

public class ManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
		System.out.println("Welcome to Poised Project Management System which keeps track of all our projects.");
	    System.out.println("\nCreate a New Project");
	    //Project Input
	    System.out.println("What is the name of the project?");
	    String projectName = input.nextLine();
	    System.out.println("What is the number of the project?");
	    String projectNumber = input.nextLine();
	    System.out.println("What type of building is the project?");
	    String projectType = input.nextLine();
	    System.out.println("What is the address of the project?");
	    String projectAddress = input.nextLine();
	    System.out.println("What is the Erf Number of the project?");
	    String projectErf = input.nextLine();
	    System.out.println("What is the total fee of the project?");
	    int projectFee = Integer.parseInt(input.nextLine());
	    System.out.println("What is the Total Amount Paid to Date?");
	    int projectPaid = Integer.parseInt(input.nextLine());
	    System.out.println("What is the deadline of the project?");
	    String projectDeadline = input.nextLine();
	    
		
		
	    //Architect Input
		
	    System.out.println("What is the name of the architect?");
	    String architectName = input.nextLine();
	    System.out.println("What is the phone number of the architect?");
	    String architectPhone = input.nextLine();
	    System.out.println("What is the email of the architect?");
	    String architectEmail = input.nextLine();
	    System.out.println("What is the physical address of the architect?");
	    String architectAddress = input.nextLine();
		
	    //contractor Input
		
	    System.out.println("What is the name of the contractor?");
	    String contractorName = input.nextLine();
	    System.out.println("What is the phone number of the contractor?");
	    String contractorPhone = input.nextLine();
	    System.out.println("What is the email of the contractor?");
	    String contractorEmail = input.nextLine();
	    System.out.println("What is the physical address of the contractor?");
	    String contractorAddress = input.nextLine();
		
	    //customer Input
		
	    System.out.println("What is the name of the customer?");
	    String customerName = input.nextLine();
	    System.out.println("What is the phone number of the customer?");
	    String customerPhone = input.nextLine();
	    System.out.println("What is the email of the customer?");
	    String customerEmail = input.nextLine();
	    System.out.println("What is the physical address of the customer?");
	    String customerAddress = input.nextLine();
		
	    //Creating the Objects
		
	    Person architect = new Person (architectName, architectPhone, architectEmail, architectAddress);
		
	    Person contractor = new Person (contractorName, contractorPhone, contractorEmail, contractorAddress);
		
	    Person customer = new Person (customerName, customerPhone, customerEmail, customerAddress);
		
		
	    Projects projectObject = new Projects (projectName,projectNumber,projectType,projectAddress,projectErf,projectFee,projectPaid,projectDeadline,architect,contractor,customer);
		
	    //Printing stored informartion
	    System.out.println(projectObject.toString());
	    System.out.println("Architect");
	    System.out.println(projectObject.getArchitect().toString());
	    System.out.println("Contractor");
	    System.out.println(projectObject.getContractor().toString());
	    System.out.println("Customer");
	    System.out.println(projectObject.getCustomer().toString());
		
	   // System.out.println(projectObject.getArchitect().getEmail());
	    	
	    //How to change the project details
	    System.out.println("Would you like to change the Deadline ? 1.Yes 2.No ");
	    int userChoice = Integer.parseInt(input.nextLine());
	    if (userChoice == 1) {
	    	System.out.println("Enter new deadline:");
	    	String newDeadline = input.nextLine();
	    	projectObject.setDeadline(newDeadline);
        	}
	    if (userChoice == 2) {
        		System.out.println("No change to deadline !");
	    }
		
	    System.out.println("Would you like to change amount paid to date ? 1.Yes 2.No ");
	    int userChoice2 = Integer.parseInt(input.nextLine());
	    if (userChoice2 == 1) {
	    	System.out.println("Enter new paid amount:");
	    	int newAmount = Integer.parseInt(input.nextLine());
	    	projectObject.setPaid(newAmount);
        	}
	    if (userChoice2 == 2) {
        		System.out.println("No change to amount paid !");
	    }
			
		//How to change person(update info)Specific details
	    System.out.println("Would you like to change the contractors contact details: ? 1.Yes 2.No ");
	    int userChoice3 = Integer.parseInt(input.nextLine());
	    if (userChoice3 == 1) {
	    	System.out.println("Enter new email:");
	    	String newEmail = input.nextLine();
	    	projectObject.getContractor().setEmail(newEmail);
			System.out.println("Enter new phone number:");
			String newNumber = input.nextLine();
			projectObject.getContractor().setPhone(newNumber);
			System.out.println("Enter new physical address:");
			String newAdrress = input.nextLine();
			projectObject.getContractor().setAddress(newAdrress);
			
			System.out.println("\nUpdated Deadline, Paid Amount and Customer Information");
			System.out.println(projectObject);
        	}
	    if (userChoice == 2) {
        		System.out.println("No change to contractor details !");
	    }

		//Finalising project
        System.out.println("\nFinalise the project");
        System.out.println("Invoice");
        System.out.println("Customer Details");
        System.out.println(projectObject.getCustomer().toString());
        System.out.println(projectObject.toInvoice());
		
			
	}

}

