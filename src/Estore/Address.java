package Estore;

public class Address {
    private final String cityName;
    private final String countryName;
    private final String houseNumber;
    private final String street;
    private final String state;

    public Address(String cityName, String countryName, String houseNumber, String street, String state){
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }
}

