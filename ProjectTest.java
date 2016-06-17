import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JEditorPane;


public class ProjectTest {



	public static void main(String[] args) {
		ProjectTest.menu();
	}
	public static void menu() {
		// Display the options to choose from.
		System.out.println("            Main Menu           ");
		System.out.println("1. Submit A Request");
		System.out.println("2. Update A Request");
		System.out.println("3. Fulfill A Request");
		System.out.println("4. Information Center");
		System.out.println("5. Quit Program");
		//Take the input and navigate to a method
		Scanner menuverify = new Scanner(System.in);
		String userInput = menuverify.next();
		//Bring user to submit a request
		if(userInput.equalsIgnoreCase("1")) {
			ProjectTest.submit(); }
		//Bring user to update a request
		if (userInput.equalsIgnoreCase("2")) {
			ProjectTest.update(); }
		//Bring user to fulfill a request
		if (userInput.equalsIgnoreCase("3")) {
			ProjectTest.fulfill(); }
		//Bring user to the information center
		if (userInput.equalsIgnoreCase("4")) {
			ProjectTest.information(); }
		//Exit user from program
		if (userInput.equalsIgnoreCase("5")) {
				System.exit(0);	
			}
		else {
			System.out.println("Command not found, please try again.");
			System.out.println("");
			ProjectTest.menu();
		}
		}
	
	 public static void submit() {
		// Display the options to choose from.
			System.out.println("            Request Options           ");
			System.out.println("1. Adoption Request");
			System.out.println("2. Rescue Request");
			//Take the input and navigate to a method
			Scanner menuverify = new Scanner(System.in);
			String userInput = menuverify.next();
			//Bring user to submit a request for 
			if(userInput.equalsIgnoreCase("1")) {
				ProjectTest.adoption(); }
			//Bring user to update a request
			if (userInput.equalsIgnoreCase("2")) {
				ProjectTest.rescue(); }
			else {
				System.out.println("Command not found, please try again.");
				System.out.println("");
				ProjectTest.submit();
			}
	 } 
	 
	//This is the method submitting an adoption request
		public static void adoption() {
		System.out.println("        Submit an Adoption       ");
		System.out.println(" ");
		Scanner test = new Scanner(System.in);
		//Take input of name
		System.out.println("Name: ");
		String name = test.nextLine();
		// Take input of date
		System.out.println("Date: ");
		String date = test.nextLine();
		//Take the input of Address
		System.out.println("Address: ");
		String address = test.nextLine();
		//Take the input of City
		System.out.println("City: ");
		String city = test.nextLine();
		//Take the input of State
		System.out.println("State: ");
		String state = test.nextLine();
		//Take the input of Zip Code
		System.out.println("Zip Code: ");
		String zipCode = test.nextLine();
		//Take the input of desired pet (ex. dog, cat, bird)
		System.out.println("Desired Pet Type: ");
		String petType = test.nextLine();
		
		//Display data that was input
		
		System.out.println("Name Entered: " + name);
		System.out.println("Date Entered: " + date);
		System.out.println("Address Entered: " + address);
		System.out.println("City Entered: " + city);
		System.out.println("State Entered: " + state);
		System.out.println("Zip Code Entered: " + zipCode);
		System.out.println("Pet Type Entered: " + petType);
		//Display a space
		System.out.println("");
		//Ask for validation
		System.out.println("Is this data correct? (yes or no)");
		Scanner verify = new Scanner(System.in);
		String userInput = verify.next();
		// check for validation. If yes exit to main menu.
		if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
			// Copy data to a text file for reference.
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("testAdoption.txt", true)))) {
			    out.println("Name: " + name + " Date: " + date + " Address: " + address + " City: " + city + " State: " +  state + " Zip Code: " + zipCode + " Pet Type: " + petType);
			}catch (IOException e) {
			}
			System.out.println("Thank you.");
			
			//Route to the main menu
			System.out.println("");
			System.out.println("");
			ProjectTest.menu();
			
		}
		// If no ask if they would like to try again. If not, exit to main menu.
		if(userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")) {
			System.out.println("Do you want to try again?");
			Scanner doubleVerify = new Scanner(System.in);
			String doubleCheck = doubleVerify.next();
			if(doubleCheck.equalsIgnoreCase("y") || doubleCheck.equalsIgnoreCase("yes")) {
				ProjectTest.adoption();
			}
			//Here is where we will route back to the main menu.
			else {
				System.out.println("");
				System.out.println("");
				ProjectTest.menu();
			}
		}
	}

		//This is the method submitting an adoption request
				public static void rescue() {
				System.out.println("        Submit a Rescue       ");
				System.out.println(" ");
				Scanner test = new Scanner(System.in);
				//Take input of name
				System.out.println("Name: ");
				String name = test.nextLine();
				// Take input of date
				System.out.println("Date: ");
				String date = test.nextLine();
				//Take the input of Address
				System.out.println("Address: ");
				String address = test.nextLine();
				//Take the input of City
				System.out.println("City: ");
				String city = test.nextLine();
				//Take the input of State
				System.out.println("State: ");
				String state = test.nextLine();
				//Take the input of Zip Code
				System.out.println("Zip Code: ");
				String zipCode = test.nextLine();
				//Take the input of desired pet (ex. dog, cat, bird)
				System.out.println("Rescue Pet Type: ");
				String petType = test.nextLine();
				
				//Display data that was input
				
				System.out.println("Name Entered: " + name);
				System.out.println("Date Entered: " + date);
				System.out.println("Address Entered: " + address);
				System.out.println("City Entered: " + city);
				System.out.println("State Entered: " + state);
				System.out.println("Zip Code Entered: " + zipCode);
				System.out.println("Rescue Type Entered: " + petType);
				//Display a space
				System.out.println("");
				//Ask for validation
				System.out.println("Is this data correct? (yes or no)");
				Scanner verify = new Scanner(System.in);
				String userInput = verify.next();
				// check for validation. If yes exit to main menu.
				if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
					// Copy data to a text file for reference.
					try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("testRescue.txt", true)))) {
					    out.println("Name: " + name + " Date: " + date + " Address: " + address + " City: " + city + " State: " +  state + " Zip Code: " + zipCode + " Pet Type: " + petType);
					}catch (IOException e) {
					}
					System.out.println("Thank you.");
					
					//Route to the main menu
					System.out.println("");
					System.out.println("");
					ProjectTest.menu();
					
				}
				// If no ask if they would like to try again. If not, exit to main menu.
				else {
					System.out.println("Do you want to try again?");
					Scanner doubleVerify = new Scanner(System.in);
					String doubleCheck = doubleVerify.next();
					if(doubleCheck.equalsIgnoreCase("y") || doubleCheck.equalsIgnoreCase("yes")) {
						ProjectTest.rescue();
					}
					//Here is where we will route back to the main menu.
					else {
						System.out.println("");
						System.out.println("");
						ProjectTest.menu();
					}
				}
			}
// Provide the user the options for Updating Files
public static void update() {
	// Display the options to choose from.
				System.out.println("            Update Options           ");
				System.out.println("1. Update Adoption Request");
				System.out.println("2. Update Rescue Request");
				//Take the input and navigate to a method
				Scanner menuverify = new Scanner(System.in);
				String userInput = menuverify.next();
				//Bring user to submit a request for 
				if(userInput.equalsIgnoreCase("1")) {
					ProjectTest.updateAdoption(); }
				//Bring user to update a request
				if (userInput.equalsIgnoreCase("2")) {
					ProjectTest.updateRescue(); }
				else {
					System.out.println("Command not found, please try again.");
					System.out.println("");
					ProjectTest.update();
				}
				}
public static void updateAdoption() {
	System.out.println("        Update an Adoption       ");
	System.out.println(" ");
	System.out.println("The document will open so that the data can be changed.");
	System.out.println("Use the features of notepad to easily edit the data.");
	System.out.println("Don't forget to save your changes to the file.");
	try {
		  Thread.sleep(8000);
		} catch (InterruptedException ie) {
		    //Handle exception
		}
	Runtime rs = Runtime.getRuntime();
    
    try {
      rs.exec("notepad testAdoption.txt");
    }
    catch (IOException e) {
      System.out.println(e);
    }   
    System.out.println("");
    System.out.println("");
    ProjectTest.menu();
}

public static void updateRescue() {
	System.out.println("        Update a Rescue       ");
	System.out.println(" ");
	System.out.println("The document will open so that the data can be changed.");
	System.out.println("Use the features of notepad to easily edit the data.");
	System.out.println("Don't forget to save your changes to the file.");
	try {
		  Thread.sleep(8000);
		} catch (InterruptedException ie) {
		    //Handle exception
		}
	Runtime rs = Runtime.getRuntime();
    
    try {
      rs.exec("notepad testRescue.txt");
    }
    catch (IOException e) {
      System.out.println(e);
    }   
    System.out.println("");
    System.out.println("");
    ProjectTest.menu();
}

//Provide the user the options for Updating Files
public static void fulfill() {
	// Display the options to choose from.
				System.out.println("            Fulfill Options           ");
				System.out.println("1. Fulfill Adoption Request");
				System.out.println("2. Fulfill Rescue Request");
				//Take the input and navigate to a method
				Scanner menuverify = new Scanner(System.in);
				String userInput = menuverify.next();
				//Bring user to submit a request for 
				if(userInput.equalsIgnoreCase("1")) {
					ProjectTest.fulfillAdoption(); }
				//Bring user to update a request
				if (userInput.equalsIgnoreCase("2")) {
					ProjectTest.fulfillRescue(); }
				else {
					System.out.println("Command not found, please try again.");
					System.out.println("");
					ProjectTest.fulfill();
				}
				}

public static void fulfillAdoption(){
	System.out.println("        Fulfill an Adoption       ");
	System.out.println(" ");
	System.out.println("To fulfill a request, there are two steps.");
	System.out.println("First you will need to remove the data from the file that appears and save.");
	//Display the request file to edit before adding to complete.
	//Provide a delay to make sure the instructions are read.
	try {
		  Thread.sleep(6000);
		} catch (InterruptedException ie) {
		    //Handle exception
		}
	Runtime rs = Runtime.getRuntime();
  
  try {
    rs.exec("notepad testAdoption.txt");
  }
  catch (IOException e) {
    System.out.println(e);
  }   
	System.out.println("Second you need to fill out the form below for our records.");
	//Display a space
	System.out.println(" ");
	Scanner test = new Scanner(System.in);
	//Take input of name
	System.out.println("Customer Name: ");
	String name = test.nextLine();
	// Take input of date
	System.out.println("Date Complete: ");
	String date = test.nextLine();
	//Take the input of pet type given(ex. dog, cat, bird)
	System.out.println("Pet Type Given: ");
	String petType = test.nextLine();
	//Take the notes from the vetinarian.
	System.out.println("Notes: ");
	String notes = test.nextLine();
	
	//Verify data before writing to complete file
	System.out.println("Customer Name: " + name);
	System.out.println("Date Complete: " + date);
	System.out.println("Pet Type Given: " + petType);
	System.out.println("Notes: " + notes);
	//Ask for validation
			System.out.println("Is this data correct? (yes or no)");
			Scanner verify = new Scanner(System.in);
			String userInput = verify.next();
			// check for validation. If yes exit to main menu.
			if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("testCompleteAdoption.txt", true)))) {
	    out.println("Customer Name: " + name + " Date Complete: " + date +  " Pet Type Given: " + petType + " Notes: " + notes);
	}catch (IOException e) {
	}
	System.out.println("Your information has been added to the file.");
	System.out.println("");
	System.out.println("");
	ProjectTest.menu();
}
			// If no ask if they would like to try again. If not, exit to main menu.
			else {
				System.out.println("Do you want to try again?");
				Scanner doubleVerify = new Scanner(System.in);
				String doubleCheck = doubleVerify.next();
				if(doubleCheck.equalsIgnoreCase("y") || doubleCheck.equalsIgnoreCase("yes")) {
					ProjectTest.fulfillAdoption();
				}
				//Here is where we will route back to the main menu.
				else {
					System.out.println("");
					System.out.println("");
					ProjectTest.menu();
				}
			  }
			}

public static void fulfillRescue(){
	System.out.println("        Fulfill a Rescue       ");
	System.out.println(" ");
				System.out.println("To fulfill a request, there are two steps.");
				System.out.println("First you will need to remove the data from the file that appears and save.");
				//Display the request file to edit before adding to complete.
				//Provide a delay to make sure the instructions are read.
				try {
					  Thread.sleep(6000);
					} catch (InterruptedException ie) {
					    //Handle exception
					}
				Runtime rs = Runtime.getRuntime();
			  
			  try {
			    rs.exec("notepad testRescue.txt");
			  }
			  catch (IOException e) {
			    System.out.println(e);
			  }   
				System.out.println("Second you need to fill out the form below for our records.");
				//Display a space
				System.out.println(" ");
				Scanner test = new Scanner(System.in);
				//Take input of name
				System.out.println("Customer Name: ");
				String name = test.nextLine();
				// Take input of date
				System.out.println("Date Complete: ");
				String date = test.nextLine();
				//Take the input of pet type given(ex. dog, cat, bird)
				System.out.println("Pet Type Requested: ");
				String petType = test.nextLine();
				//Take the notes from the vetinarian.
				System.out.println("Notes: ");
				String notes = test.nextLine();
				
				//Verify data before writing to complete file
				System.out.println("Customer Name: " + name);
				System.out.println("Date Complete: " + date);
				System.out.println("Pet Type Given: " + petType);
				System.out.println("Notes: " + notes);
				//Ask for validation
						System.out.println("Is this data correct? (yes or no)");
						Scanner verify = new Scanner(System.in);
						String userInput = verify.next();
						// check for validation. If yes exit to main menu.
						if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
				try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("testCompleteRescue.txt", true)))) {
				    out.println("Customer Name: " + name + " Date Complete: " + date +  " Pet Type Given: " + petType + " Notes: " + notes);
				}catch (IOException e) {
				}
				System.out.println("Your information has been added to the file.");
				System.out.println("");
				System.out.println("");
				ProjectTest.menu();
			}
						// If no ask if they would like to try again. If not, exit to main menu.
						else {
							System.out.println("Do you want to try again?");
							Scanner doubleVerify = new Scanner(System.in);
							String doubleCheck = doubleVerify.next();
							if(doubleCheck.equalsIgnoreCase("y") || doubleCheck.equalsIgnoreCase("yes")) {
								ProjectTest.fulfillRescue();
							}
							//Here is where we will route back to the main menu.
							else {
								System.out.println("");
								System.out.println("");
								ProjectTest.menu();
							}
						  }
						}
						public static void information() {
							// Display the options to choose from.
								System.out.println("            Information Center           ");
								System.out.println("1. Open Information");
								//System.out.println("2. Population Control");
								//System.out.println("3. Third Info");
								//Take the input and navigate to a method
								Scanner menuverify = new Scanner(System.in);
								String userInput = menuverify.next();
								
								//Bring user to information item 1 
								if(userInput.equalsIgnoreCase("1")) {
									Runtime rs = Runtime.getRuntime();
									try {
										    rs.exec("notepad Information.txt");
									}
										  catch (IOException e) {
										    System.out.println(e);
										  }

								//Bring user to information item 2
								/*if (userInput.equalsIgnoreCase("2")) {
									 try {
										    rs.exec("notepad PopControl.txt");
										  }
										  catch (IOException e) {
										    System.out.println(e);
										  }
								//Bring user to information item 3
										if (userInput.equalsIgnoreCase("3")) {
											try {
											    rs.exec("notepad testRescue.txt");
											  }
											  catch (IOException e) {
											    System.out.println(e);
							}*/
				}
			}
		}