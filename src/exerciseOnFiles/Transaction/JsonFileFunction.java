package exerciseOnFiles.Transaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonFileFunction {
    public static Transactions[] deserialize(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, Transactions[].class);
    }

    public static String serialize(Transactions transaction) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(transaction);
            return json;
        } catch (JsonProcessingException exception) {
            System.err.println(exception.getMessage());
            throw new RuntimeException(exception);
        }
    }

    public static int calculate(String fileLocation) throws IOException {
        Path path = Paths.get(fileLocation);
        String location = Files.readString(path);
        Transactions[] transactions = deserialize(location);
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i].getAmount().intValue();
        }
        return sum;
    }


public static String countSentences(String text){
    int counter = 0;
    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == '.') {
        counter++;
        }
    }
    return String.valueOf(counter);}
}