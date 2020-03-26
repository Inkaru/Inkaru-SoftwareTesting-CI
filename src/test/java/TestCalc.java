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

    @Test
    public void sinTest(){
        assertEquals(calculator.sinrad(10.8, true),-0.9809362300664916); // result in radiant
        assertEquals(calculator.sinrad(10.8, false),-56.2035059542839); // result in degrees
    }

    @Test
    public void cosTest(){
        assertEquals(calculator.cosrad(10.8, true),-0.1943299064553348); // result in radiant
        assertEquals(calculator.cosrad(10.8, false),-11.134283473062776); // result in degrees
    }

    @Test
    public void tanTest(){
        assertEquals(calculator.tanrad(10.8, true),5.047788309886065); // result in radiant
        assertEquals(calculator.tanrad(10.8, false),289.21696603194647); // result in degrees
    }

    @Test
    public void sinhTest(){
        assertEquals(calculator.sinhrad(10.8, true),24510.400557991125); // result in radiant
        assertEquals(calculator.sinhrad(10.8, false),1404342.5061479893); // result in degrees
    }

    @Test
    public void coshTest(){
        assertEquals(calculator.coshrad(10.8, true),24510.400578390625); // result in radiant
        assertEquals(calculator.coshrad(10.8, false),1404342.5073167947); // result in degrees
    }

    @Test
    public void tanhTest(){
        assertEquals(calculator.tanhrad(10.8, true),0.9999999991677205); // result in radiant
        assertEquals(calculator.tanhrad(10.8, false),57.29577946539622); // result in degrees
    }

    @Test
    public void expTest(){
        assertEquals(calculator.exp(5.5),244.69193226422038);
    }

    @Test
    public void logTest(){
        assertEquals(calculator.log(5.5),0.7403626894942439);
    }

    @Test
    public void lnTest(){
        assertEquals(calculator.ln(5.5),1.7047480922384253);
    }

    @Test
    public void powTest(){
        assertEquals(calculator.pow(10, 5.5),316227.7660168379);
    }

    @Test
    public void sqrtTest(){
        assertEquals(calculator.sqrt(5.5),2.345207879911715);
    }

}
