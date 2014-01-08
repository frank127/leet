package com.leetcode.oj.longpalindromicstring;


/**
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest
 * palindromic substring.
 * 
 * Complexity O(n^2)
 * 
 * @author frank
 * 
 */
public class Solution5 {

	public String longestPalindrome(String s) {
		String result = new String();
		
		int len = s.length();
		
		for(int i=len;i>0;i--)
		{
			for(int j =0; j<= len-i; j++)
			{
				String temp = s.substring(j, j + i);
				if(temp.length()>result.length() && isPalindromic(temp))
				{
					return result;
				}
			}
		}
		return result;
	}

	public boolean isPalindromic(String s) {		
		return new StringBuilder(s).reverse().toString().equals(s);
	}

	private String revertString(String s) {
		int len = s.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = len - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s = new Solution5();
		System.out.println(s.revertString("testset123"));
		
		System.out.println(s.longestPalindrome("testset123"));
		
	}

}
