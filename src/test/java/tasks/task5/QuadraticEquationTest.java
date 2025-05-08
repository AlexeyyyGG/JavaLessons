package tasks.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    @Test
    public void testNoRoots() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Result result = quadraticEquation.calculation(1, 0, 1);

        assertNull(result.getX1());
        assertNull(result.getX2());
        assertEquals("Нет корней", result.toString());
    }

    @Test
    public void testOneRoot() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Result result = quadraticEquation.calculation(2, 4, 2);

        assertNotNull(result.getX1());
        assertNull(result.getX2());
        assertEquals(-1.0, result.getX1());
    }

    @Test
    public void testTwoRoots() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Result result = quadraticEquation.calculation(1, -3, 2);

        assertNotNull(result.getX1());
        assertNotNull(result.getX2());
        assertEquals(1.0, result.getX1());
        assertEquals(2.0, result.getX2());
    }
}
