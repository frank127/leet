package com.leetcode.oj.medianoftwoarrays;

/**
 * There are two sorted arrays A and B of size m and n respectively. Find the
 * median of the two sorted arrays. The overall run time complexity should be
 * O(log (m+n)).
 * 
 * @author frank
 * 
 */
public class Solution2 {
	public double findMedianSortedArrays(int A[], int B[]) {
		int length = A.length + B.length;
		int index = length / 2;

		int a = 0, b = 0, current = 0;
		int x1 = 0;
		int x2 = 0;

		while (current <= index) {
			if (a == A.length) {
				x1 = B[b];
				b++;
			} else if (b == B.length) {
				x1 = A[a];
				a++;
			} else {
				if (A[a] < B[b]) {
					x1 = A[a];
					a++;
				} else {
					x1 = B[b];
					b++;
				}
			}

			if (current == index - 1 && (length % 2) == 0) {
				x2 = x1;
			}

			current++;
		}

		if ((length % 2) == 0) {
			return (double) (x2 + x1) / 2;
		} else {
			return (double) x1;
		}
	}
	
	public static void main(String[] args)
	{
		Solution2 s = new Solution2();
		int A[] = {};
		int B[] = {2,3};
		System.out.println(s.findMedianSortedArrays(A, B));
		
	}
	
	/**
	 * 
		int length = A.length + B.length;
		int index = length/2;
		
		int a = 0, b = 0, current = 0;

		int c[] = new int[length];

		while (current <= index) {
			if (a == A.length) {
				c[current++] = B[b++];
			} else if (b == B.length) {
				c[current++] = A[a++];
			} else {
				if (A[a] < B[b]) {
					c[current++] = A[a++];
				} else {
					c[current++] = B[b++];
				}
			}
		}
		
		if ((length % 2) == 0) {
			// even need to get average of two numbers
			return (double)(c[index - 1] + c[index])/2;			
		} else {
			// odd need to get the middle number
			return (double)c[index];
		}
	
	 */
}
