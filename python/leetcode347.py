class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map={}
        for i in nums:
            map[i]=map.get(i,0) + 1
        
        res=[]
        for num,count in map.items():
            res.append([count,num])
        res.sort()

        ans=[]

        while len(ans)<k:
            num=res.pop()[1]
            ans.append(num)

        return ans

        
            
    