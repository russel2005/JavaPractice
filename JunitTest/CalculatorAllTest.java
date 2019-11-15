import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorAllTest {
	
	@Test
	   public void testAddPass() {
	      // assertEquals(String message, long expected, long actual)
	      assertEquals("error in add()",  3, CalculatorAll.add(1, 2));
	      assertEquals("error in add()", -3, CalculatorAll.add(-1, -2));
	      assertEquals("error in add()",  9, CalculatorAll.add(9, 0));
	   }
	 
	   @Test
	   public void testAddFail() {
	      // assertNotEquals(String message, long expected, long actual)
	      assertNotSame("error in add()", 0, CalculatorAll.add(1, 2));
	   }
	 
	   @Test
	   public void testSubPass() {
	      assertEquals("error in sub()",  1, CalculatorAll.sub(2, 1));
	      assertEquals("error in sub()", -1, CalculatorAll.sub(-2, -1));
	      assertEquals("error in sub()",  0, CalculatorAll.sub(2, 2));
	   }
	 
	   @Test
	   public void testSubFail() {
		   assertNotSame("error in sub()", 0, CalculatorAll.sub(2, 1));
	   }

	   
	   @Test
	   public void testDivIntPass() {
	      assertEquals("error in divInt()", 3, CalculatorAll.divInt(9, 3));
	      assertEquals("error in divInt()", 0, CalculatorAll.divInt(1, 9));
	   }
	 
	   @Test
	   public void testDivIntFail() {
		   assertNotSame("error in divInt()", 1, CalculatorAll.divInt(9, 3));
	   }
	 
	   @Test(expected = IllegalArgumentException.class)
	   public void testDivIntByZero() {
	      CalculatorAll.divInt(9, 0); // expect an IllegalArgumentException
	   }
	 
	   @Test
	   public void testDivRealPass() {
	      assertEquals("error in divInt()", 0.333333, CalculatorAll.divReal(1, 3), 1e-6);
	      assertEquals("error in divInt()", 0.111111, CalculatorAll.divReal(1, 9), 1e-6);
	   }
	 
	   @Test(expected = IllegalArgumentException.class)
	   public void testDivRealByZero() {
	      CalculatorAll.divReal(9, 0); // expect an IllegalArgumentException
	   }
}
