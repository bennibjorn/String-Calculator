package stringcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	@Test
	public void testSingleNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}
	@Test
	public void testTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
}
