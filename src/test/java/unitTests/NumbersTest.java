package unitTests;

import com.myftiu.service.Numbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author by ali myftiu on 10/10/14.
 */

public class NumbersTest {


	private final int number = 9;
	private final int expectedNumber = 34;

	@Test
	public void testCase() {
		assertEquals(expectedNumber, Numbers.calculateNumber(number));
	}

}
