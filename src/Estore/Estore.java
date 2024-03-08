package Estore;

public class Estore {
    private final Customer customer;
    private final Seller seller;

    private final Admin admin;

    public Estore(Customer customer, Seller seller, Admin admin){
        this.customer = customer;
        this.seller = seller;
        this.admin = admin;
    }
}
