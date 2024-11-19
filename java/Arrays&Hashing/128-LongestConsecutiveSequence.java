/* medium
 Given an array of integers nums, return the length of the longest consecutive sequence of elements.

A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [2,20,4,10,3,4,5]

Output: 4
Explanation: The longest consecutive sequence is [2, 3, 4, 5].

Example 2:

Input: nums = [0,3,2,5,4,6,1,1]

Output: 7
Constraints:

0 <= nums.length <= 1000
-10^9 <= nums[i] <= 10^9
 */


import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        for(int num:nums){
            set.add(num);
        }
        int left,right,res=0;
        for(int num:nums){
            left=num-1;
            right=num+1;
            while(set.remove(left)){
                left--;
            }
            while(set.remove(right)){
                right++;
            }
            res = Math.max(res,right-left-1);
            if(set.size()==0){
                return res;
            }
        }
        
        return res;
}
}