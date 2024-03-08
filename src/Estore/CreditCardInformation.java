package Estore;

public class CreditCardInformation {
    private final String cvv;
    private final String cardExpirationDate;
    private final String creditCardNumber;
    private final String cardName;
    private final String cardType;


    public CreditCardInformation(String cvv, String cardExpirationDate, String creditCardNumber, String cardName, String cardType){
        this.cvv = cvv;
        this.cardExpirationDate = cardExpirationDate;
        this.creditCardNumber = creditCardNumber;
        this.cardName = cardName;
        this.cardType = cardType;
    }
}
