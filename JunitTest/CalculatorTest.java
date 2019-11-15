import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
	Calculator calculator = null;

    @Before
    public void setUp() throws Exception {
    	calculator = new Calculator();
    }

    @Test
    public void addingMultipleNumbersProducesResult() throws Exception {
      //  Calculator calculator = new Calculator();
        int answer = calculator.addNumbers(1 ,2, 3);
        assertEquals(6, answer);
    }

    @Test
    public void addingSingleNumberTotalsAppropriately() throws Exception {
     // Calculator calculator = new Calculator();
        int answer = calculator.addNumbers(25);
        assertEquals(25, answer);
    }
    
    @Test(expected = ArithmeticException.class)
    public void callingEmptyAddNumber(){
    	int answer = calculator.addNumbers();
    	System.out.println(answer);
    }
}
