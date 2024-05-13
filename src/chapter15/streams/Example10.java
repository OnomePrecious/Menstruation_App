package chapter15.streams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example10 {
    public static void main(String[] args)  throws IOException{
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaTask\\src\\chapter15\\streams\\sample3.txt";
        Path path = Paths.get(location);

        BufferedWriter writer = Files.newBufferedWriter(path);// if you don't want to use try and catch, use the close or flush method and you can only use this when working with files.
        writer.write("Happy birthday");
        writer.close(); //writer.flush();
    }
    // the process of converting objects in a specific language to json is serialization, the opposite of this is deserialization.
}
