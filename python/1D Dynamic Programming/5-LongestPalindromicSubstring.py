""" medium
Given a string s, return the longest substring of s that is a palindrome.

A palindrome is a string that reads the same forward and backward.

If there are multiple palindromic substrings that have the same length, return any one of them.

Example 1:

Input: s = "ababd"

Output: "bab"
Explanation: Both "aba" and "bab" are valid answers.

Example 2:

Input: s = "abbc"

Output: "bb"
Constraints:

1 <= s.length <= 1000
s contains only digits and English letters."""


class Solution:

    def longestPalindrome(self, s: str) -> str:
        
        if len(s)<=1:
            return s

        def expand_center(left, right):
            while left>=0 and right<len(s) and s[left]==s[right]:
                left-=1
                right+=1

            return s[left+1:right]

        longstr=s[0]

        for i in range(len(s)):
            odd = expand_center(i,i)

            even=expand_center(i,i+1)

            longstr=max(odd,even,longstr,key=len)

        return longstr

