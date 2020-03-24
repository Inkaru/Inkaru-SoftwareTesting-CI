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

    @Test
    public void substractTest(){ assertEquals(calculator.substract(10.5,5.5), 5.0, 0);}

    @Test
    public void multiplyTest(){ assertEquals(calculator.multiply(10.5,2.0), 21.0, 0);}

    @Test
    public void toIntegerTest(){ assertEquals(calculator.toInteger(10.5), 10, 0);}

    @Test
    public void roundedNumberTest(){
        assertEquals(calculator.roundedNumber(10.8),11);
        assertEquals(calculator.roundedNumber(10.3),10);
        assertEquals(calculator.roundedNumber(10.5),11);//In case of exactly 0.5, we return the upper number
    }

    @Test
    public void moduloTest(){
        assertEquals(calculator.modulo(11,3),2);
    }

    @Test
    public void moduloByZeroTest(){
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.modulo(5,0));

        String expectedMessage = "modulo by zero is forbidden";
        assertEquals(exception.getMessage(), expectedMessage);
    }

    @Test
    public void moduloWithFloatTest(){
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.modulo(5.5,1));

        String expectedMessage = "modulo with float is forbidden";
        assertEquals(exception.getMessage(), expectedMessage);

        exception = assertThrows(ArithmeticException.class, () -> calculator.modulo(5,1.2));
        assertEquals(exception.getMessage(), expectedMessage);
    }


}
