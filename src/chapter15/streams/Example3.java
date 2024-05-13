package chapter15.streams;

import java.io.IOException;
import java.io.PrintStream;

public class Example3 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaTask\\src\\chapter15\\files\\streams\\sample3.txt";
        try(PrintStream printStream = new PrintStream(fileLocation)) {
            System.setOut(printStream);
            System.out.println("Trying to be done"); // it sout into the file created.
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
        }
    }
