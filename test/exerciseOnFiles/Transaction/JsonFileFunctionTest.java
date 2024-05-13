package exerciseOnFiles.Transaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;

import static exerciseOnFiles.Transaction.Type.DEBIT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonFileFunctionTest {

    @Test
    public void test_deserialize() throws JsonProcessingException {
        Transaction transaction = new Transaction(1, "Precious", 200000, DEBIT, LocalDateTime.now());
        String json = JsonFileFunction.serialize(transaction);
        Transaction[] result = JsonFileFunction.deserialize(json);

        assertNotNull(result);
        assertEquals("Precious", transaction.getName(), json);
    }

    @Test
  public void calculate() throws IOException {
        Transaction transaction = new Transaction();
        transaction.setId(1);
        transaction.setName("Precious");
        transaction.setAmount(200000);
        transaction.setType(DEBIT);
        transaction.setDate(LocalDateTime.now());
        //String json = JsonFileFunction.serialize(transaction);
       // Transaction[] result = JsonFileFunction.deserialize(json);
        int numberOfTransactions = JsonFileFunction.calculate("C:\\Users\\DELL\\IdeaProjects\\javaTask\\src\\exerciseOnFiles\\Transaction\\transactions.json");
        assertEquals(1, numberOfTransactions);

    }

    @Test
    public void countNumberOfSentencesInATextFile() {
        String text = "This is a text file.";
        String result = "1";
        assertEquals(result, JsonFileFunction.countSentences(text));
    }
}