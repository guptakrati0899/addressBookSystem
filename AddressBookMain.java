package addressBookSystem;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookMain {
	      
	  
	        private String firstName;
	        private String lastName;
	        private String address;
	        private String city;
	        private String state;
	        private int zip;
	        private long phoneNumber;
	        private String email;
	      

	        void getEntry()          
	        {
	      
	            Scanner sc = new Scanner(System.in);

	            System.out.print("\n\tEnter First Name : ");
	            firstName = sc.nextLine();

	            System.out.print("\n\tEnter Last Name : ");
	            lastName = sc.nextLine();

	            System.out.print("\n\tEnter Address : ");
	            address = sc.nextLine();

	            System.out.print("\n\tEnter City : ");
	            city  = sc.nextLine();

	            System.out.print("\n\tEnter State : ");
	            state  = sc.nextLine();
	            
	            System.out.println("\n\tEnter Email : ");
	            email =sc.nextLine();

	            System.out.print("\n\tEnter Zip : ");
	            zip = sc.nextInt();

	            System.out.print("\n\tEnter Phone Number : ");
	            phoneNumber = sc.nextLong();
	            
	            }
	            
	            public void readEntry(){
	            System.out.println("First Name:"+firstName );
	            System.out.println("Last Name:"+lastName );
	            System.out.println("Address:"+address );
	            System.out.println("City:"+city );
	            System.out.println("State:"+state);
	            System.out.println("Email:"+email );
	            System.out.println("Zip:"+zip );
	            System.out.println("Phone Number:"+phoneNumber );
	          
	        }
	   

            public static void main(String[] args) {
         	   
         	   System.out.println("Welcome to Address Book Master Branch");
         	   
         	   AddressBookMain a = new AddressBookMain();
         	   
         	   a.getEntry();
         	   a.readEntry();
         	   
            }
}

