/* medium
 You are given an integer array heights where heights[i] represents the height of the ith bar

You may choose any two bars to form a container. Return the maximum amount of water a container can store.

Example 1:
Input: height = [1,7,2,5,4,7,3,6]

Output: 36
Example 2:

Input: height = [2,2,2]

Output: 4
Constraints:

2 <= height.length <= 1000
0 <= height[i] <= 1000
 */

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