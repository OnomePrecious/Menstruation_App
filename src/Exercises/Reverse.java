package Exercises;

public class Reverse {
    public String reversedString(String userInput) {
        String reversed = "";
        String result;
        for (int i = 0; i < userInput.length(); i++) {
            result = String.valueOf(userInput.charAt(i));
            reversed = result + reversed;
        }
         return reversed;
    }
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        String input = "It is still a beautiful world";
        System.out.println(reverse.reversedString(input));
    }

}