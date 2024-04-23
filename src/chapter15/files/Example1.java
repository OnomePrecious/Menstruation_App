package chapter15.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {
        try {
            //step 1

            //Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\javaTask\\src\\CardShuffling\\text.txt");
            Path path1 = Paths.get("C:\\Users\\DELL\\IdeaProjects\\javaTask\\src\\ArrayExercises\\text.txt");

            //Files.createFile(path);
            Files.deleteIfExists(path1);
           // System.out.println("File created successfully");
            System.out.println("File deleted successfully");
            // step 2
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}