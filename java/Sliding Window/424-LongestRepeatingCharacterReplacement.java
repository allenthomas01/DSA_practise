/* medium
 You are given a string s consisting of only uppercase english characters and an integer k. You can choose up to k characters of the string and replace them with any other uppercase English character.

After performing at most k replacements, return the length of the longest substring which contains only one distinct character.

Example 1:

Input: s = "XYYX", k = 2

Output: 4
Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's with 'X's.

Example 2:

Input: s = "AAABABB", k = 1

Output: 5
Constraints:

1 <= s.length <= 1000
0 <= k <= s.length
 */

import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,res=0,maxfreq=0;

        Map<Character,Integer> charCount = new HashMap<>();

        for(int right=0;right<s.length();right++){
            charCount.put(s.charAt(right),charCount.getOrDefault(s.charAt(right),0) + 1 );
            
            maxfreq=Collections.max(charCount.values());
            
            while((right-left+1) - maxfreq > k){
                
                charCount.put(s.charAt(left), charCount.get(s.charAt(left))-1);
                left+=1;
            }
            
            
            res=Math.max(res,right-left+1);
            
        }
        
        
        return res;
    }
}