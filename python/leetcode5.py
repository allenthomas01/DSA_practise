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

