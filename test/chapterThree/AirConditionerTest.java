package chapterThree;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;


public class AirConditionerTest {
    private AirConditioner ac;

    @BeforeEach
    public void initializer() {
        ac = new AirConditioner();
    }
    @Test
    public void isOn_acIsOn(){
        assertFalse(ac.acIsOn());
        ac.getAcIsOn();
        assertTrue(ac.acIsOn());
    }
    @Test
    public void isOff_acIsOff(){
        ac.getAcIsOn();
        assertTrue(ac.acIsOn());
        ac.getAcIsOff();
        assertFalse(ac.acIsOn());
    }
    @Test
    public void testThat_acTemperatureIncreases(){
        ac.getAcIsOn();
        assertTrue(ac.acIsOn());
      int result = ac.getAcTemperature();
      assertEquals(16, result);
      ac.increaseTemperature();
      assertEquals(17, ac.getAcTemperature());
    }
    @Test
    public void testThat_acTemperatureDecreases(){
        ac.getAcIsOn();
        assertTrue(ac.acIsOn());
        int result = ac.getAcTemperature();
                assertEquals(16, result);
        ac.decreaseTemperature();
        assertEquals(16, ac.getAcTemperature());
    }
@Test
    public void increaseTemperature_temperatureIncreases(){
        ac.getAcIsOn();
        assertTrue(ac.acIsOn());
        assertEquals(16, ac.getAcTemperature());
        ac.increaseTemperature();
        for (int index = 0; index < 16; index++) {
            ac.increaseTemperature();
        }
        assertEquals(30, ac.getAcTemperature());
        }
        @Test
    public void decreaseTemperature_temperatureDecreases(){
        ac.getAcIsOn();
        assertTrue(ac.acIsOn());
        int result = ac.getAcTemperature();
        assertEquals( 16, result);
        ac.decreaseTemperature();
        assertEquals(16, ac.getAcTemperature());
        }

}




