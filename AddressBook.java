import java.util.Scanner;

public class AddressBook {
    Contacts details = new Contacts("N", "V", "Hyd", "Hyd",
            "telangana", "508243", "9346787765", "nv@gmail.com");
    Scanner sc = new Scanner(System.in);
    Contacts contact = new Contacts();

    public void addContact() {
        System.out.println("enter no of persons to add");
        int person = sc.nextInt();
        Contacts[] contactArr = new Contacts[person];
        for (int i = 0; i < person; i++) {
            System.out.println("enter" + (i + 1));
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
            contactArr[i] = contact;
        }
        for (int i = 0; i < person; i++) {
            System.out.println(contactArr[i]);
        }
    }
}