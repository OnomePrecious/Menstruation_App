package chapter15.streams;

import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaTask\\src\\chapter15\\streams\\sample6.txt";
        try (FileWriter fileWriter = new FileWriter(fileLocation)) {
            fileWriter.write("Hello World");
        }catch(IOException e){
            System.err.println("Error:" + e.getMessage());
        }

        }

}
