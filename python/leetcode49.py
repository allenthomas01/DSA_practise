class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}
        for word in strs:
            sortedword=sorted(word)
            sortedword=''.join(sortedword)
            if sortedword in map:
                map[sortedword].append(word)
            else:
                map[sortedword]=[word]
        
        ans=[]

        for key in map:
            ans.append(map[key])
        return ans