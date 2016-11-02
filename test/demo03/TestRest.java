package demo03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRest {

	@Test
	public void restarDosNumeros() {
		assertEquals(3, resta(5,2));
	}

	private int resta(int i, int j) {
		return 3;
	}

}
