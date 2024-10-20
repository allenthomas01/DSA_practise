class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;
        int maxarea=0,area=0;
        int commonheight,width;
        while(left < right){
          commonheight=  Math.min(height[left],height[right]);
          width = right -left;
          area = commonheight * width;
          maxarea = Math.max(maxarea,area);
          if(height[left]<=height[right]){
            left++;
          }else{
            right--;
          }

        }
        return maxarea;
    }
}