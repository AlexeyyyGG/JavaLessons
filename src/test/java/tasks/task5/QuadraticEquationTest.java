package tasks.task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {
    private final QuadraticEquation quadraticEquation = new QuadraticEquation();

    @ParameterizedTest
    @CsvSource(value = {
        "1, 0, 1, null, null, Нет корней",
        "2, 4, 2, -1.0, null, Один корень х1 = -1.0",
        "1, -3, 2, 1.0, 2.0, Два корня x1 = 1.0 x2 = 2.0"
    }, nullValues = "null")
    public void testRoots(Double a, Double b, Double c, Double expectedX1, Double expectedX2,
        String expextedToString) {
        Result result = quadraticEquation.calculation(a, b, c);

        if (expectedX1 == null) {
            assertNull(result.getX1());
        } else {
            assertEquals(expectedX1, result.getX1());
        }

        if (expectedX2 == null) {
            assertNull(result.getX2());
        } else {
            assertEquals(expectedX2, result.getX2());
        }

        assertEquals(expextedToString, result.toString());
    }
}
