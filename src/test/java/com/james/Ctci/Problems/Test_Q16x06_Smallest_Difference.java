package com.james.Ctci.Problems;

import org.junit.*;
import static org.junit.Assert.*;

public class Test_Q16x06_Smallest_Difference {
	@Test
	public void BookExample() {
		int[] a = new int[] { 1, 3, 15, 11, 2 };
		int[] b = new int[] { 23, 127, 235, 19, 8 };

		int result = Q16x06_Smallest_Difference.FindSmallestDiff(a, b);
		assertEquals(3, result);
	}
	
	@Test
	public void SameValues() {
		run(new int[] { 1, 3, 15, 11, 2 },
			new int[] { 1, 3, 15, 11, 2 }, 
			0);
	}
	
	@Test
	public void EmptyArrays() {
		run(new int[] { },
			new int[] { 1, 3, 15, 11, 2 }, 
			-1);
		run(new int[] { },
			new int[] { }, 
			-1);
	}
	
	@Test
	public void NegativeValue01() {
		run(new int[] { 1, 3, 15, 11, 2 },
			new int[] { -1 }, 
			2);
	}
	
	@Test
	public void NegativeValue02() {
		run(new int[] { 1, 3, 15, 11, 2 },
			new int[] { 23, 127, 235, 19, -5, -6, -7 }, 
			4);
	}
	
	@Test
	public void NegativeValue03() {
		run(new int[] { 1, 3, 15, 11, 2 },
			new int[] { 23, 127, 235, 29, -5, -6, -7 }, 
			6);
	}
	
	@Test
	public void NegativeValue04() {
		run(new int[] { -1, -3, 15, 11, 2 },
			new int[] { 23, 127, 235, 29, -5, -6, -7 }, 
			2);
	}
	
	private void run(int[] a, int[] b, int expectedResult) {
		int actualResult = Q16x06_Smallest_Difference.FindSmallestDiff(a, b);
		assertEquals(expectedResult, actualResult);
	}
}
