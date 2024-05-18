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
        Transactions transactions = new Transactions(1, "Precious", 200000, DEBIT, LocalDateTime.now());
        String json = JsonFileFunction.serialize(transactions);
        Transactions[] result = JsonFileFunction.deserialize(json);

        assertNotNull(result);
        assertEquals("Precious", transactions.getName(), json);
    }

    @Test
  public void calculate() throws IOException {
        Transactions transactions = new Transactions();
        transactions.setId(1);
        transactions.setName("Precious");
        transactions.setAmount(200000);
        transactions.setType(DEBIT);
        transactions.setDate(LocalDateTime.now());
        //String json = JsonFileFunction.serialize(transactions);
       // Transactions[] result = JsonFileFunction.deserialize(json);
        int numberOfTransactions = JsonFileFunction.calculate("C:\\Users\\DELL\\IdeaProjects\\javaTask\\src\\exerciseOnFiles\\Transactions\\transactions.json");
        assertEquals(1, numberOfTransactions);

    }

    @Test
    public void countNumberOfSentencesInATextFile() {
        String text = "This is a text file.";
        String result = "1";
        assertEquals(result, JsonFileFunction.countSentences(text));
    }
}