import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalc {

    private static App calculator;

    @BeforeEach
    public void beforeEach(){
        calculator = new App();
    }

    @Test
    public void addTest(){
        assertEquals(calculator.add(1.5,2.5), 4, 0);
    }

    @Test
    public void divideTest() {
        assertEquals(calculator.divide(5,2), 2.5, 0);
    }

    @Test
    public void divideNullTest() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5,0));

        String expectedMessage = "division by zero is forbidden";
        assertEquals(exception.getMessage(), expectedMessage);
    }
}
