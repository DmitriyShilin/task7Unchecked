package exampleuncheckedexception.arithmetic;

import exampleuncheckedexception.exception.DivideByZeroException;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivideTest {
    
    @Test
    public void testDivide() {
        Divide instance = new Divide(10.0, 3.0);
        double expResult = 3.33;
        double result = instance.divide();
        assertEquals(expResult, result, 0.1);
    }    
    
    @Test(expected = DivideByZeroException.class)
    public void testDivideException() {
        Divide instance = new Divide(10.0, 0.0);
        double expResult = 3.33;
        double result = instance.divide();
        assertEquals(expResult, result, 0.1);
    }
}
