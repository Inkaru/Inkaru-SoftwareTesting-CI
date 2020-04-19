import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestIntegration {

    private static App calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new App();
    }

    @Test
    public void integration1_Exception() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.add(5, calculator.divide(2, 0)));
        String expectedMessage = "division by zero is forbidden";
        assertEquals(exception.getMessage(), expectedMessage);
    }

    @Test
    public void integration1_Result() {
        assertEquals(5.5, calculator.add(5, calculator.divide(1, 2)));
    }

    @Test
    public void integration2_Exception() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.add(3, calculator.modulo(2, 0)));
        String expectedMessage = "modulo by zero is forbidden";
        assertEquals(exception.getMessage(), expectedMessage);
    }

    @Test
    public void integration2_Result() {
        assertEquals(3, calculator.substract(5, calculator.modulo(14, 6)));
    }

    @Test
    public void integration3() {
        assertEquals(3, calculator.toInteger(calculator.log(1024)));
    }

    @Test
    public void integration4() {
        int a = 3;
        int b = 6;
        int c = 9;

        int x = 2;

        double res = calculator.substract(calculator.multiply(calculator.pow(x, 2), a) + calculator.multiply(x, b), c);
        assertEquals(a * Math.pow(x,2) + b * x - c, res);
    }

    @Test
    public void integration5() {
        assertEquals(4, calculator.sqrt(calculator.pow(4,2)));
    }

}
