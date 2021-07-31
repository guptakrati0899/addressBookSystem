package addressBookSystem;
import java.util.Scanner;


public class AddressBookMain {
	      
	  
	    public static void main(String[] args){
	        Scanner s = new Scanner(System.in);
	        System.out.print("How many books do you want to create? ");
	        int maxEntries;
	        int howManyEntries;

	        AddressBook[] account = new AddressBook[0];


	       while(true){
	            maxEntries = s.nextInt();
	            if (maxEntries>0){
	                account = new AddressBook[maxEntries];                   //This code decides how many books are in the array of books
	                break;
	            }
	            else System.out.print("You must create at least 1 entry.");
	            }



	        for (int i=0;i<account.length;i++){


	            account[i] = new AddressBook(); //Fixed reference to null because each book in the library had not been initialized yet.

	            while(true){
	                System.out.print("How many entries in book "+i+"? ");
	                howManyEntries = s.nextInt();
	                if (howManyEntries>0) {
	                    account[i].initEntries(howManyEntries);                 //This code decides how many entries are in each book in the Account
	                    break;
	                }
	                else System.out.println("You must create at least 1 Entry.");
	                }


	        }
	        boolean done = false;
	        int selectedBook = 0;
	        int selection;
	        while (done==false){
	            System.out.println("Address Book "+selectedBook+" is currently selected.");

	            for (int i = 0;i<account[selectedBook].getEntries();i++){
	                System.out.println("===========Entry "+i+" ===========");
	                account[selectedBook].contents[i].readEntry(); //Accessing the array of entries INSIDE the array of Address books
	                System.out.println("================================");
	            }


	            System.out.println("Select an option!");
	            System.out.println("1. Add an entry");
	            System.out.println("2. Edit Existing Entry");
	            System.out.println("3. Exit the menu");
	            System.out.print("> ");
	            selection = s.nextInt();
	            String firstName, lastName, address,city,zip,phoneNumber, email;
	            switch(selection){
	            case 1: 
	                System.out.print("First name? ");
	                firstName = s.next();
	                System.out.print("Last name? ");
	                lastName = s.next();
	                System.out.print("Address? ");
	                address = s.next();
	                System.out.print("City? ");
	                city = s.next();
	                System.out.print("Zip? ");
	                zip = s.next();
	                System.out.print("Phone Number? ");
	                phoneNumber = s.next();
	                System.out.print("Email? ");
	                email = s.next();
	                account[selectedBook].add(firstName, lastName, address,city,zip,phoneNumber, email);
	                break;
	                

	         
	            case 2:
	                System.out.print("Edit which entry?");
	                int whichEntry = s.nextInt();
	                System.out.print("First name? ");
	                firstName= s.next();
	                System.out.print("Last name? ");
	                lastName = s.next();
	                System.out.print("Address? ");
	                address = s.next();
	                System.out.print("City? ");
	                city = s.next();
	                System.out.print("Zip? ");
	                zip = s.next();
	                System.out.print("Phone Number? ");
	                phoneNumber = s.next();
	                System.out.print("Email? ");
	                email = s.next();
	                account[selectedBook].edit(firstName, lastName, address,city,zip,phoneNumber, email, whichEntry);
	                break;
	                
	            case 3:
	                done = true;
	                break;
	                
	            default:
	                System.out.print("Please choose a valid menu number");


	            }
	        }
	    }
	}
