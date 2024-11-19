/* easy
 Given an array nums containing n integers in the range [0, n] without any duplicates, return the single number in the range that is missing from nums.

Follow-up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

Example 1:

Input: nums = [1,2,3]

Output: 0
Explanation: Since there are 3 numbers, the range is [0,3]. The missing number is 0 since it does not appear in nums.

Example 2:

Input: nums = [0,2]

Output: 1
Constraints:

1 <= nums.length <= 1000
 */

class leetcode268{
    public int missingNumber(int[] nums) {
        
        int res=nums.length;
		
		for(int i=0;i<nums.length;i++){
		    res=res^i^nums[i];
		}

        return res;

    }
}