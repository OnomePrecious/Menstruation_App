package chunk;

import java.util.Scanner;

public class Contact {

    private String firstName;
    Scanner input = new Scanner(System.in);
    private String lastName;
    private String number;

    private String emailAddress;

    public Contact(String firstName, String lastName, String number, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.emailAddress = emailAddress;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

public void addContact(){
        System.out.println("Enter first name:");
        String firstName1  = input.nextLine();
        System.out.println("Enter last name: ");
        String lastName1 = input.nextLine();
        System.out.println("Enter phone number: ");
        String phone = input.nextLine();
        System.out.println("Enter email address: ");
        String address = input.nextLine();
    }

}



