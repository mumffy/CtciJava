package com.james.Ctci.Problems;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class Test_Q16x07_Number_Max {
	@Test
	public void basicTests() {
		int result;
		result = Q16x07_Number_Max.FindMax(8, 3);
		assertEquals(8,  result);
		result = Q16x07_Number_Max.FindMax(3, 8);
		assertEquals(8,  result);
		result = Q16x07_Number_Max.FindMax(100000, -55);
		assertEquals(100000, result);
		result = Q16x07_Number_Max.FindMax(-55, 100000);
		assertEquals(100000, result);
		result = Q16x07_Number_Max.FindMax(Integer.MAX_VALUE, 15);
		assertEquals(Integer.MAX_VALUE, result);
	}
	
	@Test
	public void strangeTests() {
		int result;
		result = Q16x07_Number_Max.FindMax(15, 15);
		assertEquals(15, result);
		result = Q16x07_Number_Max.FindMax(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void integerOverflow01() {
		int result;		
		result = Q16x07_Number_Max.FindMax(Integer.MAX_VALUE, -15);
		assertEquals(Integer.MAX_VALUE, result);
		
	}
	
	@Test
	public void integerOverflow02() {
		int result = Q16x07_Number_Max.FindMax(-15, Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, result);
	}
	
	@Test
	public void integerOverflow03() {
		int result = Q16x07_Number_Max.FindMax(Integer.MIN_VALUE, 1);
		assertEquals(1, result);
	}
	
	@Test
	public void integerOverflow04() {
		int result = Q16x07_Number_Max.FindMax(1, Integer.MIN_VALUE);
		assertEquals(1, result);
	}
}
