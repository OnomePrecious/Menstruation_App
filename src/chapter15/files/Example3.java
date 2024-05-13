package chapter15.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {
    public static void main(String[] args) throws IOException {
        String location = "";

        Path path = Paths.get(location);
        Files.delete(path);
    }
}

// to work with a file, we use the steps above


// java.io package
//the below are the superclass of all classes(java.io)
// InputStream    outputStream

//byte based io stream processes information in byte
//character based io stream processes body of text as a collection of characters
