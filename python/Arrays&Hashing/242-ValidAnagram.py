""" easy
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.
"""


class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        countchars={}

        for x in s:
            if x in countchars:
                countchars[x]+=1
            else:
                countchars[x]=1
        
        for y in t:
            if y in countchars:
                countchars[y]-=1
            else:
                countchars[y]=-1
                #tricky part here.


        
        for i in countchars.values():
            if i !=0:
                return False
        
        return True