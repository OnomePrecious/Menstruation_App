package chapter15.json.serialization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;
@JsonInclude(JsonInclude.Include.NON_EMPTY)

// @JsonInclude(JsonInclude.Include.NON_NULL) if you did not set a value that's supposed to be set,instead of it to print null, it won't print anything
// @JsonInclude(JsonIn// clude.Include.NON_EMPTY) to say that a field is not empty, it skips null field and omits the empty field.
public class Person {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
private String name;
    @JsonProperty("dob")// it changes the name of the instance variable dateOfBirth to dob because it was annotated under it.
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateOfBirth;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private  String phoneNumber;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Gender gender;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                '}';
    }
    public Person() {}

    public Person(String name, LocalDate dateOfBirth, String phoneNumber, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
