package chapter15.json.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static chapter15.json.serialization.Gender.FEMALE;
import static chapter15.json.serialization.Gender.MALE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonSerializerTest {
    @Test
    public void testSerialize() {
        Person person = new Person();
        person.setName("Precious");
        LocalDate dateOfBirth = LocalDate.of(2020, 10, 10);
        person.setDateOfBirth(dateOfBirth);
        person.setGender(FEMALE);
        person.setPhoneNumber("09034746724");
        String json = JsonSerializer.serialize(person);
        String expected = "{\"name\":\"Precious\",\"dob\":\"2024-03-03\",\"phoneNumber\":\"09034746724\",\"gender\":\"FEMALE\"}";
        assertEquals(expected, json);

    }
    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person = new Person("John", LocalDate.now(), "09034746724", MALE);
        String json = JsonSerializer.serialize(person);
        Person personFromJson = JsonSerializer.deserialize(json);

        System.out.println("personFromJson: " + personFromJson);

        assertNotNull(personFromJson);
        assertEquals(personFromJson.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(MALE, personFromJson.getGender());
        assertEquals("John", personFromJson.getName());
        assertEquals("09034746724", personFromJson.getPhoneNumber());
    }
}