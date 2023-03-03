import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    Contacts details = new Contacts("N", "V", "Hyd", "Hyd",
            "telangana", "508243", "9346787765", "nv@gmail.com");
    Scanner sc = new Scanner(System.in);
    Contacts contact = new Contacts();

    public void addContact() {
        System.out.println("Enter First Name");
        contact.setFIRST_NAME(sc.next());
        System.out.println("Enter last Name");
        contact.setLAST_NAME(sc.next());
        System.out.println("Enter Address");
        contact.setADDRESS(sc.next());
        System.out.println("Enter Your City Name");
        contact.setCITY(sc.next());
        System.out.println("Enter Your State");
        contact.setSTATE(sc.next());
        System.out.println("Enter Zip");
        contact.setZip(sc.next());
        System.out.println("Enter Phone Number");
        contact.setPHONE_NUMBER(sc.next());
        System.out.println("Enter Email");
        contact.setEMAIL_ID(sc.next());
        System.out.println(contact);
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to Edit :  ");
        String name = sc.nextLine();
        if (contact.getFIRST_NAME().equals(name)) {
            contact = null;
            System.out.println(contact);
        } else {
            System.out.println("Name is not present");
        }
    }
}