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