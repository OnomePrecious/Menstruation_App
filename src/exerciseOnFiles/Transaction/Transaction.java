package exerciseOnFiles.Transaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@JsonInclude(JsonInclude.Include.NON_EMPTY)


public class Transaction {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)

    private int id;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private BigDecimal amount;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Type type;
   // @JsonProperty("date")// it changes the name of the instance variable dateOfBirth to dob because it was annotated under it.
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDateTime date;


    // private List<Transaction> transactions = new ArrayList<>();

    public Transaction(int id, String name, int amount, Type type, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.amount = BigDecimal.valueOf(amount);
        this.type = type;
        this.date = date;
    }
public Transaction(){

}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", type=" + type +
                ", date=" + date +
                '}';
    }
}
