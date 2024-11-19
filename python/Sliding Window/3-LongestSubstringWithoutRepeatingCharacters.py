"""medium
Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.

A substring is a contiguous sequence of characters within a string.

Example 1:

Input: s = "zxyzxyz"

Output: 3
Explanation: The string "xyz" is the longest without duplicate characters.

Example 2:

Input: s = "xxxx"

Output: 1
Constraints:

0 <= s.length <= 1000
s may consist of printable ASCII characters."""

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left=0
        set1=set() # set to store substring. 
        maxlength=0
        for right in range(len(s)):
            while s[right] in set1:
                set1.remove(s[left])
                left+=1

            set1.add(s[right])
            maxlength=max(maxlength,right-left+1)

        
        return maxlength