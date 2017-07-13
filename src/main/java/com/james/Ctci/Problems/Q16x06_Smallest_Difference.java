package com.james.Ctci.Problems;

import java.util.Arrays;

public class Q16x06_Smallest_Difference {
	public static int FindSmallestDiff(int[] a, int[] b) {
		final int lengthA = a.length;
		final int lengthB = b.length;
		if (lengthA < 1 || lengthB < 1) {
			return -1;
		}

		Arrays.sort(a);
		Arrays.sort(b);
		int minDiff = Math.abs(a[0] - b[0]);
		int posA = 0;
		int posB = 0;
		while (posA < lengthA && posB < lengthB) {
			int diff = Math.abs(a[posA] - b[posB]);
			if (diff < minDiff) {
				minDiff = diff;
			}

			if (a[posA] == b[posB]) {
				return 0;
			} else if (a[posA] < b[posB]) {
				posA++;
			} else { // a[posA] >= b[posB]
				posB++;
			}
		}

		return minDiff;
	}
}
