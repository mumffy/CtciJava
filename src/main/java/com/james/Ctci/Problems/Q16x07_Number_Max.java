package com.james.Ctci.Problems;

public class Q16x07_Number_Max {
/*  original implementation which didn't handle integer overflows
	public static int FindMax(int a, int b) {
		int diff = a - b;
		byte sign = getSignBit(diff);
		byte invertedSign = (byte) (sign ^ 1);
		int max = invertedSign * a + sign * b;
		return max;
	} */

	public static int FindMax(int a, int b) {
		byte signA = getSignBit(a);
		byte signB = getSignBit(b);

		int mixedSigns = signA ^ signB;
		int notMixedSigns = mixedSigns ^ 1;

		int max = mixedSigns * FindMaxMixedSigns(a, b) + notMixedSigns * FindMaxSameSigns(a, b);
		return max;
	}

	public static int FindMaxSameSigns(int a, int b) {
		int diff = a - b;
		int sign = getSignBit(diff);				
		int invertedSign = sign ^ 1;
		int max = invertedSign * a + sign * b;
		return max;
	}
	
	public static int FindMaxMixedSigns(int a, int b) {
		int diff = a - b;
		int signA = getSignBit(a);		
		int signDiff = getSignBit(diff);
	
		// detect overflow
		int hadOverflow = signA ^ signDiff;		
		// flip bit if overflow detected
		int chooseB = signDiff ^ hadOverflow;		
		int chooseA = chooseB ^ 1;
		
		int max = chooseA * a + chooseB * b;		
		return max;
	}

	private static byte getSignBit(int n) {
		int shifted = n >> 31;
		return (byte) (shifted & 1);
	}
}