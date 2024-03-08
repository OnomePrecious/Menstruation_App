package Estore;

public class Customer {
    private final BillingInformation billingInfo;
    private ShoppingCart cart;

    public Customer(BillingInformation billingInfo, ShoppingCart cart) {
        this.billingInfo = billingInfo;
        this.cart = cart;
    }
}
