package chapter15.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Paths
//windows ===> C: \DELL\DESKTOP\
//unix ==> /home/user/...

public class Example {
    //TODO: java.io and java.nio, io means input, output, nio means nonblocking

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\");
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            //step 1
            directoryStream.forEach(System.out::println);

        }catch(IOException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }
        }
    }


