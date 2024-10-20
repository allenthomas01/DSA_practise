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