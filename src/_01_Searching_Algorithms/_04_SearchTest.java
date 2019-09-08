package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] arr1 = { "a", "c", "d", "b", "h", "p" };
		assertEquals(_00_LinearSearch.linearSearch(arr1, "d"), 2);
		String[] arr2 = { "6", "9", "1", "3", "7", "9" };
		assertEquals(_00_LinearSearch.linearSearch(arr2, "10"), -1);
		String[] arr3 = { "z", "y", "b", "c", "p", "q" };
		assertEquals(_00_LinearSearch.linearSearch(arr3, "p"), 4);
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(_01_BinarySearch.binarySearch(arr1, 1, 10, 8), 7);
		int[] arr2 = { 3, 4, 6, 10, 12 };
		assertEquals(_01_BinarySearch.binarySearch(arr2, 2, 5, 10), 3);
		int[] arr3 = { 1, 5, 6, 8, 9, 13, 15, 18 };
		assertEquals(_01_BinarySearch.binarySearch(arr3, 2, 7, 13), 5);
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] arr1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		assertEquals(_02_InterpolationSearch.interpolationSearch(arr1, 12), 5);
		int[] arr2 = { 9, 18, 27, 36, 45, 54, 63, 72, 81 };
		assertEquals(_02_InterpolationSearch.interpolationSearch(arr2, 63), 6);
		int[] arr3 = { 6, 12, 18, 24, 30 };
		assertEquals(_02_InterpolationSearch.interpolationSearch(arr3, 17), -1);
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30 };
		assertEquals(_03_ExponentialSearch.exponentialSearch(arr1, 25), 24);
		int[] arr2 = { 3, 6,9,12,15,18,21,24,27,30};
		assertEquals(_03_ExponentialSearch.exponentialSearch(arr2, 18), 5);
		int[] arr3 = {7,14,21,28,35,42,49,56,63,70,77,84,91};
		assertEquals(_03_ExponentialSearch.exponentialSearch(arr3, 84),11);
	}
}
