package Exercises;

    import java.util.Scanner;

    public class Palindrome {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num;

            while (true) {
                System.out.print("Enter a five-digit integer: ");
                String input = scanner.nextLine();

                if (input.matches("\\d{5}")) {
                    num = Integer.parseInt(input);
                    break;
                } else {
                    System.out.println("Error: Please enter a valid five-digit integer.");
                }
            }

            String original = Integer.toString(num);
            StringBuilder reversed = new StringBuilder();

            for (int i = original.length() - 1; i >= 0; i--) {
                reversed.append(original.charAt(i));
            }

            if (original.contentEquals(reversed)) {
                System.out.println(reversed +  " is a palindrome.");
            } else {
                System.out.println(reversed + " is not a palindrome.");
            }
        }
    }


