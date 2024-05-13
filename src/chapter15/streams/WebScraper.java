package chapter15.streams;

import java.io.InputStream;
import java.net.URL;

public class WebScraper {
    public static void main(String[] args) {
        //https: // www.google.com/welcome.html?name=john&age = 11
        //scheme -> https
        //domain name -> www.google.com
        //path -> /welcome.html?name=john&age = 11tt
        try {
            String location = "https://www.google.com";
            URL url = new URL(location);
            InputStream inputStream = url.openStream();

            byte[] bytes = inputStream.readAllBytes();

            for (byte data : bytes) {
                System.out.println(Character.toString(data));

            }
        }catch (Exception ex){
            System.err.println("Error: " + ex.getMessage());
            ex.printStackTrace();

        }
    }
}
