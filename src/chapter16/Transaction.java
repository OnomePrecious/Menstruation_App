package chapter16;

public class Transaction {
    private String amount ="";
    private String accountNumber ="";

    public Transaction(String amount, String accountNumber) {
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
