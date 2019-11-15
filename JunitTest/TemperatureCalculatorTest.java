import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureCalculatorTest {
	
    @Test
    public void testToDegree(){
        TemperatureCalculator calculator = new TemperatureCalculator();
        assertEquals(36.666668f,calculator.toDegree(98),0);
    }
 
    @Test
    public void testToFahrenheit(){
        TemperatureCalculator calculator = new TemperatureCalculator();
        assertEquals("Test failed for Degree to Fahrenheit",212f,calculator.toFahrenheit(100),0);
    }
}
