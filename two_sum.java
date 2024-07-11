class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        int[] arr = new int[2];

        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(target-nums[i])){

               
                arr[0]=i;
                arr[1]=hashmap.get(target-nums[i]);
            }else{
                hashmap.put(nums[i],i);
            }
        }     
        
        return arr;
    }
}