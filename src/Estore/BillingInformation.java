package Estore;

public class BillingInformation {

    private final String phoneNumber;
    private final String receiverName;

    private final String deliveryAddress;
    private final CreditCardInformation creditCardInfo;

    public BillingInformation(String phoneNumber, String receiverName, String deliveryAddress, CreditCardInformation creditCardInfo){
        this.phoneNumber = phoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInfo = creditCardInfo;
    }
}
