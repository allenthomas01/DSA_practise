/* medium
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
s may consist of printable ASCII characters.
 */

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left=0;
        int maxlength=0;
        Set<Character> charset = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(charset.contains(s.charAt(right))){
                charset.remove(s.charAt(left));
                left++;
            }
            charset.add(s.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }

        return maxlength;
    }
}