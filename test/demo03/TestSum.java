package demo03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {

	@Test
	public void testSum2Num() {
		assertEquals(6, sum(4, 2));
	}
	
	@Test
	public void testSumWithZero() {
		assertEquals(3, sum(3, 0));
		assertEquals(3, sum(0, 3));
	}
	
	@Test
	public void testSumWithNeg() {
		assertEquals(4, sum(6, -2));
		assertEquals(4, sum(-2, 6));
		assertEquals(-7, sum(-3,-4));
	}

	@Test
	public void sumaTresNumeros() {
		assertEquals(15, Math.sum(3, 5, 7));
	}
	
	private int sum(int i, int j) {
		return Math.sum(i,  j);
	}

}
