package IntroToJUnitTest;

import static org.junit.Assert.*;

import javax.swing.plaf.metal.MetalInternalFrameTitlePane;

import org.junit.Test;

public class LearningJUnitTest {

	// @Test
	// public void test() {
	// fail("Not yet implemented");
	// }
	// int add(int a, int b) {
	// return a+b;
	// }
	@Test
	public void MultTest() {

		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));
	}

	String multiply(int a, int b) {
		String finalNumber = "";
		finalNumber += a + " x " + b + " = " + a * b;
		// int number = a*b;

		return finalNumber;
	}

	@Test
	public void PrimeTest() {

		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));

	}

	boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	boolean isSquare(int number) {
		int n = (int)Math.sqrt(number);
		if(n==Math.sqrt(number)){
			return true;
		}
		return false;
	}
	@Test
	  public void CubeTest() {
	 
	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }
	boolean isCube(int number) {
		int n = (int)Math.cbrt(number);
		if(n==Math.cbrt(number)) {
			return true;
		}
		return false;
	}

	

}