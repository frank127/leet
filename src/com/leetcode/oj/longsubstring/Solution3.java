package com.leetcode.oj.longsubstring;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author frank
 * 
 */
public class Solution3 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;

		int maxLen = 0;

		for (int start = 0; start < s.length(); start++) {
			int offset = 0;
			while ((start + offset) < s.length()) {
				String s1 = s.substring(start, start + offset + 1);
				String s2;
				
				if ((start + offset + 2) > s.length())
				{
					s2 = s.substring(start + offset + 1);
				} else {
					s2 = s.substring(start + offset + 1, start + offset + 2);
				}

				if (!s1.contains(s2)) {
					offset++;
				} else {
					if (s1.length() > maxLen) {
						maxLen = s1.length();
					}
					break;
				}
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.lengthOfLongestSubstring("qopubjguxhxdipfzwswybgfylqvjzhar"));
	}
}
