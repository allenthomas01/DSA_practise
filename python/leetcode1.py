class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict1={}

        for i in range(len(nums)):
            complement=target-nums[i]
            if complement in dict1:
                return [i,dict1[complement]]
            else:
                dict1[nums[i]]=i