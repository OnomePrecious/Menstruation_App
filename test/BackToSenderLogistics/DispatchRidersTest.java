package BackToSenderLogistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispatchRidersTest {

    @Test
    public void testSuccessfulDeliveryOf80_ridersPayment() {
        assertEquals(45_000, DispatchRiders.ridersPayment(80));
    }

    @Test
    public void testSuccessfulDeliveryOf25_ridersPayment() {
        assertEquals(9_000, DispatchRiders.ridersPayment(25));
    }

    @Test
    public void testSuccessfulDeliveryOf70_ridersPayment() {
        assertEquals(40_000, DispatchRiders.ridersPayment(70));
    }

    @Test
    public void testInputZero_throwsAnException() {
        assertThrows(InvalidInputException.class, () -> DispatchRiders.ridersPayment(0));

    }
}