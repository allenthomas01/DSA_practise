class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix =1,postfix=1;
	 int[] output = new int[nums.length];
	 
	 for(int i=0;i<output.length;i++){
	     output[i]=prefix;
	     prefix*=nums[i];
	 }
	 for(int i=output.length-1;i>=0;i--){
	     output[i]*=postfix;
	     postfix*=nums[i];
	 }

     return output;
    }
}