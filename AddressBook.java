package addressBookSystem;
import java.util.Scanner;

public class AddressBook{
    Scanner s = new Scanner(System.in);
    //Nested class for each entry
    class Entry{
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String zip;
        private String phoneNumber;
        private String email;
        Entry(String firstName, String lastName, String address,String city,String zip,String phoneNumber, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city=city;
            this.zip=zip;
            this.phoneNumber=phoneNumber;
            this.email = email;
        }
        Entry(){
            firstName = "";
            lastName = "";
            address = "";
            city = "";
            zip= "";
            phoneNumber = "";
            email = "";
        }
        public void readEntry(){
            System.out.println("First Name:"+firstName );
            System.out.println("Last Name:"+lastName );
            System.out.println("Address:"+address );
            System.out.println("City:"+city );
            System.out.println("Zip:"+zip );
            System.out.println("Phone Number:"+phoneNumber );
            System.out.println("Email:"+email );
        }
    }


    //Keeps track of how many entries are in the Address book
    private int entries = 0;
    Entry[] contents;
    public void initEntries(int e){
        contents = new Entry[e];
        for (int i = 0;i<contents.length;i++){      //Initializes an array of entries, then loops through to initialize each individual entry
            contents[i] = new Entry();
        }
    }
    public int getEntries(){
        return contents.length;
    }
    //Adds an entry to the Address book
    public void add(String firstName, String lastName, String address,String city,String zip,String phoneNumber, String email){
        if (entries<contents.length){
        contents[entries] = new Entry(firstName, lastName, address,city,zip,phoneNumber,email);
        entries++;
        }
        else System.out.println("Error:Address book is full");
    }
    public void edit(String firstName, String lastName, String address,String city,String zip,String phoneNumber, String email,int selection){
        contents[selection].firstName = firstName;
        contents[selection].lastName = lastName;
        contents[selection].address = address;
        contents[selection].city = city;
        contents[selection].zip = zip;
        contents[selection].phoneNumber = phoneNumber;
        contents[selection].email = email;
    }
}
