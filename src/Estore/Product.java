package Estore;

public class Product {
    private final int productId;
    private final String productName;
    private final double price;
    private final String productDescription;
    private final ProductCategory category;

    public Product(int productId, String productName, double price, String productDescription, ProductCategory category){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.category = category;
    }

}
