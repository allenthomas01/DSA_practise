class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        distinct_list=set()
        for i in nums:
            if i in distinct_list:
                return True
            else:
                distinct_list.add(i)
            
        return False