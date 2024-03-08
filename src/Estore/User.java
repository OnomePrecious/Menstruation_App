package Estore;

public class User {
    private final int age;
    private final String emailAddress;
    private final String homeAddress;
    private final String name;
    private final String password;
    private final String phone;

    public User(int age, String emailAddress, String homeAddress, String name, String password, String phone){
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
}
