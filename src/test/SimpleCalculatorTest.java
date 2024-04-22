package test;

import static org.junit.Assert.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class SimpleCalculatorTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private SimpleCalculator createTestSubject() {
		return new SimpleCalculator();
	}

	
	@Test
	public void testAdd() throws Exception {
		SimpleCalculator testSubject;
		int a = 4;
		int b = 5;
		int result;
		int expected = 9;

		// default test
		testSubject = createTestSubject();
		result = testSubject.add(a, b);
		assertEquals(expected, result);
	}

	
	@Test
	public void testSubtract() throws Exception {
		SimpleCalculator testSubject;
		int a = 4;
		int b = 5;
		int result;
		int expected = -1;

		// default test
		testSubject = createTestSubject();
		result = testSubject.subtract(a, b);
		assertEquals(expected, result);
	}

	
	@Test
	public void testMultiply() throws Exception {
		SimpleCalculator testSubject;
		int a = 4;
		int b = 5;
		int result;
		int expected = 20;

		// default test
		testSubject = createTestSubject();
		result = testSubject.multiply(a, b);
		assertEquals(expected, result);
	}

	
	@Test
	public void testDivide() throws Exception {
		SimpleCalculator testSubject;
		int a = 10;
		int b = 5;
		int result;
		int expected = 2;
		
		testSubject = createTestSubject();
		result = testSubject.divide(a, b);
		assertEquals(expected, result);

	}
}