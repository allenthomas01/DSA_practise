class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
       
        
        int sum,i,j,k;
        
        for(i=0;i<nums.length-2;i++){
             j=i+1;
             k=nums.length-1;
             if(i>0 && nums[i]==nums[i-1]){
                continue;
             }
            
            while(j<k ){
                sum=nums[i]+nums[j]+nums[k];
               
                if(sum==0){
                    output.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                    
                }else if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }
                

            }
        }

        
        
        
        return output;
    }
}