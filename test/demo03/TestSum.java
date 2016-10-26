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

	private int sum(int i, int j) {
		return i+j;
	}

}
