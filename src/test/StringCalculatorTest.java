package stringcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	// test cases for 1st Kata step
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	@Test
	public void testSingleNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}
	@Test
	public void testSingleNumber2() {
		assertEquals(50, StringCalculator.add("50"));
	}
	@Test
	public void testTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	@Test
	public void testTwoNumbers2() {
		assertEquals(12, StringCalculator.add("6,6"));
	}
	// 2nd Kata step
	@Test
	public void testMultipleNumbers1() {
		assertEquals(60, StringCalculator.add("10,20,30"));
	}
	@Test
	public void testMultipleNumbers2() {
		assertEquals(227, StringCalculator.add("5,32,6,54,85,39,1,2,3"));
	}
	// 3rd Kata step
	
	@Test
	public void testNewLineDelimiter() {
		assertEquals(3, StringCalculator.add("1/n2"));
	}
	@Test
	public void testNewlineDelimiter() {
		assertEquals(60, StringCalculator.add("10/n20/n30"));
	}
	@Test
	public void testNewlineAndComma() {
		assertEquals(10, StringCalculator.add("3/n5,2"));
	}
	@Test
	public void testDifferentDelimiter() {
		assertEquals(3, StringCalculator.add("//;\n1;2"));
	}
	@Test
	public void testDifferentDelimiter2() {
		assertEquals(6, StringCalculator.add("//;\n1;2;3"));
	}
	/*
	@Test
	public void testNegatives1() {
		try {
			StringCalculator.add("1,-2");
			fail("Exception Expected");
		}
		catch(RuntimeException ex) {
			//assertEquals("Negatives not allowed: -2", ex.getMessage());
		}
	}
	public void testNegatives2() {
		assertEquals("Negatives not allowed: -1, -4", StringCalculator.add("-1,2,3,-4"));
		
	}
	*/
}
