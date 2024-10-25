class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left=0
        char_count={}
        maxfreq=0;res=0

        for right in range(len(s)):
            
            char_count[s[right]]= char_count.get(s[right],0) + 1
            
            maxfreq = max(char_count.values())
            
            
            
            while (right-left+1) - maxfreq > k:
                
                char_count[s[left]]-= 1
                left+=1
            
            res=max(res,right-left+1)
            
        return res
