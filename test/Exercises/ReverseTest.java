package Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
public void testThatICanReverseAString() {
        Reverse reverse = new Reverse();
        String input = "it is still a beautiful world";
        String output = "dlrow lufituaeb a llits si ti";
        assertEquals(output, reverse.reversedString(input));
    }
    @Test
    public void testThatICanReverseAnInt() {
        Reverse reverse = new Reverse();
        String input = "1,2,3,4,5,6,7,8,9,10";
        String output = "01,9,8,7,6,5,4,3,2,1";
        assertEquals(output, reverse.reversedString(input));
    }


}