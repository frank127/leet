package com.leetcode.oj.longpalindromicstring;

/**
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest
 * palindromic substring.
 * 
 * Complexity O(n)
 * 
 * reference link
 * Longest Palindromic Substring Part II
 * http://leetcode.com/2011/11/longest-palindromic-substring-part-ii.html
 * 
 * @author frank
 * 
 */

public class Solution5_2 {
	
	// Transform S into T.
	// For example, S = "abba", T = "^#a#b#b#a#$".
	// ^ and $ signs are sentinels appended to each end to avoid bounds checking
	public String preProcess(String s) {
		int n = s.length();
		if (n == 0)
			return "^$";
		String ret = "^";
		for (int i = 0; i < n; i++) {
			ret += "#" + s.substring(i, i + 1);
		}

		ret += "#$";

		return ret;
	}
}
