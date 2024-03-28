package SubtractMiniAndMaxi;

import Exercises.DemoSubtract;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DemoSubtractTest {
    @Test
    public void testThatICanSubtractMinimumAndMaximumNumber() {
        int[] numbers = {2, 4, 5, 7, 8};
        int[] output = {6};
        assertArrayEquals(output, DemoSubtract.maximumNumber(numbers));
    }

    }