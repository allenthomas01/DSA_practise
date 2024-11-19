/* medium
 Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.

Example 1:

Input: nums = [1,2,2,3,3,3], k = 2

Output: [2,3]
Example 2:

Input: nums = [7,7], k = 1

Output: [7]
Constraints:

1 <= nums.length <= 10^4.
-1000 <= nums[i] <= 1000
1 <= k <= number of distinct elements in nums.

 */

import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     
     		HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        
        ArrayList<Integer> list[] = new ArrayList[nums.length+1];

        for(int key:map.keySet()){
            int count = map.get(key);
            
            if(list[count]==null){
                list[count]= new ArrayList<>();
            }
            list[count].add(key);

        }
        
        
        int[] output = new int[k];
        int index=0;
        
        for(int i=list.length-1;i>=0;i--){
            if(list[i]!=null){
                for(int value:list[i]){
                    output[index++]=value;
                    if(index==k){
                        return output;
                    }
                }
            }
        }
        
        return output;


    }

    
}