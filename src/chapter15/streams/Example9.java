package chapter15.streams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static java.lang.System.out;

public class Example9 {
    public static void main(String[] args) {
        try (OutputStreamWriter writer = new OutputStreamWriter(out);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Hello guys, it's break time");

        }catch (IOException exception) {
            System.err.println("Error: " + exception.getMessage()); // flushes the stream means pushing the data out of the stream;
        }


        }
    }

