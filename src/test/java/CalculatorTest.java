import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    void divide() {
        assertAll(() -> assertEquals(0.25, Calculator.divide(2, 2)),
                () -> assertEquals(-0.25, Calculator.divide(2, -2)),
                () -> assertEquals(0.25, Calculator.divide(-2, -2)),
                () -> assertEquals(0.05, Calculator.divide(10, 2)));
    }
}