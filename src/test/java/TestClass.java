import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestClass {

    private static App calculator;

    @Before
    public void beforeEach(){
        calculator = new App();
    }

    @Test
    public void addTest(){
        assertEquals(calculator.add(1.5,2.5), 4, 0);
    }
}
