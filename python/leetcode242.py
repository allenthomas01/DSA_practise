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