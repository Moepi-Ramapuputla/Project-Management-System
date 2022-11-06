package projectManagementSystem;

import java.io.*;
import java.text.*;
import java.util.Date;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner; 
import java.sql.*;

public class ManagementSystem {
	
	public static void main(String[] args) {
		ArrayList <Projects> projectList = new ArrayList<>();
		while (true){
			try {
				Scanner input = new Scanner(System.in);
				boolean mainLoop = true;		
				int choice;
				do{
					System.out.println("Welcome to Poised Project Management System which keeps track of all our projects.\n");
		            System.out.print("1.) Read Existing Projects text file and import current projects and use this information to create a list of project objects \n");
		            System.out.print("2.) Capture information about new projects. \n");
		            System.out.print("3.) Update information about existing projects.\n");
		            System.out.print("4.) Finalise existing projects.\n");
		            System.out.print("5.) See a list of projects that still need to be completed.\n");
		            System.out.print("6.) See a list of projects that are past the due date.\n");
		            System.out.print("7.) Find and select a project by entering either the project number or projec name.\n");
		            System.out.print("8.) Exit\n");
		            System.out.print("\nEnter Your Menu Choice: ");
		            choice = input.nextInt();  
		            
					
		        switch(choice){
		
		        case 1:
		        	//reading file to create objects
		    		try {
		    			File x = new File("existingProjects.txt");
		    			Scanner sc = new Scanner(x);		    			
		    			//Get number of lines in file
		    			Path file = Paths.get("existingProjects.txt");		
		    			// read all lines of the file
		    			long count = Files.lines(file).count();
		    			int intCount=(int)count;		    			
		    			//read file and create object
		    			for (int i = 0; i < intCount; i++) {
		    				String line = Files.readAllLines(Paths.get("existingProjects.txt")).get(i);
		    				//System.out.println(line);
		    				String[] arrOfStr = line.split(",");
		    				//System.out.println(line);
		    				//converting string to int
		    				int projectFee = Integer.parseInt(arrOfStr[5]);
		    				int projectPaid = Integer.parseInt(arrOfStr[6]);
		    				//Creating the Objects
		    				Person architect = new Person (arrOfStr[8], arrOfStr[9], arrOfStr[10], arrOfStr[11]);
		    				Person contractor = new Person (arrOfStr[12], arrOfStr[13], arrOfStr[14], arrOfStr[15]);
		    				Person customer = new Person (arrOfStr[16], arrOfStr[17], arrOfStr[18], arrOfStr[19]);		    			
		    				Projects projectObject = new Projects (arrOfStr[0],arrOfStr[1],arrOfStr[2],arrOfStr[3],arrOfStr[4],projectFee,projectPaid,arrOfStr[7],architect,contractor,customer,arrOfStr[20]);
		    				//adding existing objects to projectList(ArrayList)
		    				projectList.add(projectObject);
	
		    				}
		    			sc.close();
		    			}
		    		catch (FileNotFoundException e) {
		    			System.out.println("Error");
		    			}
		    		catch(IOException e){
		    	       System.out.println(e);}
		    		
		    		System.out.println("\nSuccessful the file existingProjects.txt has been opened and read the data from the file !");
		    		System.out.println("Also created Project Objects and appended these object into the Project list");
		            break; 
		
		        case 2:    
					    try {
		        	  ///Creating Project
		    	    System.out.println("\nCreate a New Project");
		    	    Scanner input2 = new Scanner(System.in);		    	    
		    	    //Project Input
		    	    System.out.println("What is the name of the project?");
		    	    String projectName = input2.nextLine();
		    	    System.out.println("What is the number of the project?");
		    	    String projectNumber = input2.nextLine();
		    	    System.out.println("What type of building is the project?");
		    	    String projectType = input2.nextLine();
		    	    System.out.println("What is the address of the project?");
		    	    String projectAddress = input2.nextLine();
		    	    System.out.println("What is the Erf Number of the project?");
		    	    String projectErf = input2.nextLine();
		    	    System.out.println("What is the total fee of the project?");
		    	    int projectFee = Integer.parseInt(input2.nextLine());
		    	    System.out.println("What is the Total Amount Paid to Date?");
		    	    int projectPaid = Integer.parseInt(input2.nextLine());
		    	    System.out.println("What is the deadline of the project?");
		    	    String projectDeadline = input2.nextLine();
		    	    String projectCompletion ="Not Finalised" ;		    	    
		    	    //Architect Input		    		
		    	    System.out.println("What is the name of the architect?");
		    	    String architectName = input2.nextLine();
		    	    System.out.println("What is the phone number of the architect?");
		    	    String architectPhone = input2.nextLine();
		    	    System.out.println("What is the email of the architect?");
		    	    String architectEmail = input2.nextLine();
		    	    System.out.println("What is the physical address of the architect?");
		    	    String architectAddress = input2.nextLine();		    		
		    	    //contractor Input		    		
		    	    System.out.println("What is the name of the contractor?");
		    	    String contractorName = input2.nextLine();
		    	    System.out.println("What is the phone number of the contractor?");
		    	    String contractorPhone = input2.nextLine();
		    	    System.out.println("What is the email of the contractor?");
		    	    String contractorEmail = input2.nextLine();
		    	    System.out.println("What is the physical address of the contractor?");
		    	    String contractorAddress = input2.nextLine();		    		
		    	    //customer Input		    		
		    	    System.out.println("What is the name of the customer?");
		    	    String customerName = input2.nextLine();
		    	    System.out.println("What is the phone number of the customer?");
		    	    String customerPhone = input2.nextLine();
		    	    System.out.println("What is the email of the customer?");
		    	    String customerEmail = input2.nextLine();
		    	    System.out.println("What is the physical address of the customer?");
		    	    String customerAddress = input2.nextLine();		    	    
		    	    //Creating the Objects		    		
		    	    Person architect = new Person (architectName, architectPhone, architectEmail, architectAddress);		    		
		    	    Person contractor = new Person (contractorName, contractorPhone, contractorEmail, contractorAddress);		    		
		    	    Person customer = new Person (customerName, customerPhone, customerEmail, customerAddress);
		    	    Projects projectObject = new Projects (projectName,projectNumber,projectType,projectAddress,projectErf,projectFee,projectPaid,projectDeadline,architect,contractor,customer,projectCompletion);
		    	    //adding existing objects to projectList(ArrayList)
		    	    projectList.add(projectObject);
		    	    //Printing stored information
		    	   System.out.println(projectObject.toString());
		    	   //To get specific information example architect info
		    	   System.out.println(projectObject.getArchitect().getEmail());		   
					    } catch (NumberFormatException e) {
					        System.out.println("Made a mistake! That is not a valid number. Try again.\n");
					      }
					    break; 
		
		        case 3:
		          System.out.println("Update Selected");
		  	      System.out.println("List of all projects");
		  	      Scanner input3 = new Scanner(System.in);

		  	      //print list of projects
		  	      for( int z =0 ; z < projectList.size() ; z++) {
					System.out.println("\nProject " + z);
					System.out.println(projectList.get(z).toString());
			  		}
     
		  	    		  	System.out.println("\nSelect a project number from above to update:" );  
			  	    	  	int userChoice6 = Integer.parseInt(input3.nextLine());
			  	    	  	System.out.println("\nProject " + userChoice6 + " selected for update:" );
			  	    	  	System.out.println(projectList.get(userChoice6));
				  	    	//How to change the project details
				  	  	    System.out.println("\nWould you like to change the Deadline ? 1.Yes 2.No ");
				  	  	    int userChoice2 = Integer.parseInt(input3.nextLine());
				  	  	    if (userChoice2 == 1) {
				  	  	    	System.out.println("Enter new deadline:");
				  	  	    	String newDeadline = input3.nextLine();
				  	  	    	//Changing value of array
				  	  	    	projectList.get(userChoice6).setDeadline(newDeadline);
				  	  	    }
				  	  	
				  	  	    if (userChoice2 == 2) {
				  	          		System.out.println("No change to deadline !");
				  	  	    }
				  	  		
				  	  	    System.out.println("\nWould you like to change amount paid to date ? 1.Yes 2.No ");
				  	  	    int userChoice3 = Integer.parseInt(input3.nextLine());
				  	  	    if (userChoice3 == 1) {
				  	  	    	System.out.println("Enter new paid amount:");
				  	  	    	int newAmount = Integer.parseInt(input3.nextLine()); 
				  	  	    	projectList.get(userChoice6).setPaid(newAmount);
				  	          	}
				  	  	    
				  	  	    if (userChoice3 == 2) {
				  	          		System.out.println("No change to amount paid !");
				  	  	    }				  	  			
				  	  		//How to change person(update info)Specific details
				  	  	    System.out.println("Would you like to change the contractors contact details: ? 1.Yes 2.No ");
				  	  	    int userChoice4 = Integer.parseInt(input3.nextLine());
				  	  	    if (userChoice4 == 1) {
				  	  	    	System.out.println("Enter new email:");
				  	  	    	String newEmail = input3.nextLine();
				  	  	    	projectList.get(userChoice6).getContractor().setEmail(newEmail);
				  	  	    	
				  	  			System.out.println("Enter new phone number:");
				  	  			String newNumber = input3.nextLine();
				  	  			projectList.get(userChoice6).getContractor().setPhone(newNumber);
				  	  			
				  	  			System.out.println("Enter new physical address:");
				  	  			String newAddress = input3.nextLine();
				  	  			projectList.get(userChoice6).getContractor().setAddress(newAddress);
								  	  			
				  	  			System.out.println("\nUpdated Deadline, Paid Amount and Customer Information");
				  	  	    }
				  	  	    
				  	  	    if (userChoice4 == 2) {
				  	          		System.out.println("No change to contractor details !");
				  	  	    }				  	  				  	      
				            break;				
		        case 4: 
		        	System.out.println("Finalise Selected");
		  	      //Show list first
		  	      System.out.println("List of all projects");
		  	      Scanner input4 = new Scanner(System.in);
		  	      
		  	      //print list of projects
		  	      for( int y =0 ; y < projectList.size() ; y++) {
					System.out.println("\nProject " + y);
					System.out.println(projectList.get(y).toString());
			  		}	
		  	    	 
		  	    	  System.out.println("\nSelect a project number from above to finalise:" );  
		  	    	  int userChoice7 = Integer.parseInt(input4.nextLine());
		  	    	  System.out.println("\nProject " + userChoice7 + " selected to finalise" ); 
		  	  			int totalOwed = projectList.get(userChoice7).getBalance();
		  	  			if ( totalOwed > 0) {
		  	  				//issue invoice
		  	  				System.out.println("\nInvoice");
		  	  		        System.out.println("Customer Details");
		  	  		        System.out.println(projectList.get(userChoice7).getCustomer().printDetails());
		  	  		        System.out.println("Total Amount still to be paid: " + totalOwed);		  	  		        
		  	  		        //mark as finalised and add completion date to existingProjects.txt then add to completeted projects.txt
		  	  		        System.out.println("\nEnter Completion date: ");
		  	  		        String completionDate = input4.nextLine();        
		  	  		        projectList.get(userChoice7).setCompletion("Yes Finalised");
		  	  		    
		  	  		        //I must still add string for completion date maybe replace
		  	  			}

		  	  			if ( totalOwed == 0) {
		  	  				System.out.print("Full amount already paid!");
		  	  				System.out.print("Therefore no invoice will be issued as has already been done previously. ");
		  	  			}
		            break;
		            
		        case 5: 
		        	System.out.print("\nList of projects that must still be completed");
		  			for( int y =0 ; y < projectList.size() ; y++) {
						String completionStatus = projectList.get(y).getCompletion();
						int status = completionStatus.indexOf("Not Finalised");
						if ( status > -1) {	
							System.out.println("\nProject " + y);
							System.out.println(projectList.get(y));
		  	  			}  
				  	}
		            break;
		            
		        case 6:
				    	  System.out.println("\nProjects past due date:");
				   		    		  
				    		    try {
				    		    SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
				    		    for (int y =0 ; y < projectList.size() ; y++) {
				    		      Date projectDeadline2 = sdformat.parse(projectList.get(y).getDeadline());
				    			  Date	currentDate = sdformat.parse("2022-05-10");		    			  
				    			  //prints if Current date occurs after project deadline
				    		      if(currentDate.compareTo(projectDeadline2) > 0) {
				    		    	  System.out.println("\nProject " + y);
				    		    	  System.out.println(projectList.get(y));
				    		      }
				    		    }
				    		    } catch (ParseException e) {
				    		    	e.printStackTrace();
				    		    }				    		  
				    		  
				    	
		            break;
		            
		        case 7:
				  		
				  		Scanner input7 = new Scanner(System.in); 
				  		System.out.println("\nFind and select a project by entering either the project number or project name :");
				  		String userSelectedProject = input7.nextLine();
				  		for( int y =0 ; y < projectList.size() ; y++) {
				  			String projectLine = projectList.get(y).getName();
				  			String projectLine2 = projectList.get(y).getprojNumber();
							int matchName = projectLine.indexOf(userSelectedProject);
							int matchNumber = projectLine2.indexOf(userSelectedProject);
							if (( matchName > -1)||(matchNumber > -1)) {	
								System.out.println(projectList.get(y));
			  	  			}  
					  	}
				  			
				  		   
		            break;   
		
		        case 8: 
		            System.out.println("Exiting Program.");
		            for( int y =0 ; y < projectList.size() ; y++) {
						String completionStatus = projectList.get(y).getCompletion();
						int status = completionStatus.indexOf("Not Finalised");
						if ( status > -1) {	
							try (FileWriter f = new FileWriter("existingProjects.txt", false);
		  	  			    		BufferedWriter b = new BufferedWriter(f); 
		  	  			    		PrintWriter p = new PrintWriter(b);) { 
								String plainLine = projectList.get(y).plainData();
		  	  			    	p.println(plainLine); 
		  	  			
		  	  			    } catch (IOException i) { 
		  	  			    	i.printStackTrace();
		  	  			    	} 
						}
						
						int status2 = completionStatus.indexOf("Yes Finalised");	
						if ( status2 > -1) {	
								try (FileWriter f = new FileWriter("completedProjects.txt", false);
			  	  			    		BufferedWriter b = new BufferedWriter(f); 
			  	  			    		PrintWriter p = new PrintWriter(b);) { 
									String plainLine = projectList.get(y).plainData();
			  	  			    	p.println(plainLine); 
			  	  			
			  	  			    } catch (IOException i) { 
			  	  			    	i.printStackTrace();
			  	  			    	}
						}
		  	  		}  
		            System.exit(0);
		             break;
		        default:
		        System.out.println(choice + " is not a valid Menu Option! Please Select Another.");
		        }		 		    	
		        } while(choice != 8 );
		        input.close();
				} catch (InputMismatchException e) {
				        System.out.println("Made a mistake! That is not a valid number. Try again.\n");
				      }
		}
			}
		}
		
		
				
			    
		
		
