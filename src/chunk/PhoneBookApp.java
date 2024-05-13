package chunk;

import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. create new contact");
            System.out.println("Press 2 to Exit");
            System.out.print("Choose an option: ");

            int options = input.nextInt();
            input.nextLine();

            if (options == 1) {
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter phone number: ");
                String phoneNumber = input.nextLine();
                if (phoneNumber.length() != 11) ;
                System.out.println("try again");
            }
                 if (options == 2) {
                     break;
                 }
                 }

                        System.out.println("chunk.Contact saved");

                    }

            }



