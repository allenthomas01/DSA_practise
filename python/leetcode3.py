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