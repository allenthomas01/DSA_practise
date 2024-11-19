/* easy
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false

*/


import java.util.*;

class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> hashset = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            if(hashset.contains(nums[i])){
                return true;
            }
            else{
                hashset.add(nums[i]);
            }
        }
        return false;
        
 
    }
}