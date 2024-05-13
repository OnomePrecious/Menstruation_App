package chapter15.streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
      String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaTask\\src\\chapter15\\streams\\sample7.txt";
     try(FileInputStream fileInputStream = new FileInputStream(fileLocation)){
         InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
      BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.println(reader.lines().collect(Collectors.joining("\n")));
         ;// we need a reader to create a reader
    }catch(IOException exception){
         System.err.println("Error:" + exception.getMessage());
         exception.printStackTrace();

    }
}
    }