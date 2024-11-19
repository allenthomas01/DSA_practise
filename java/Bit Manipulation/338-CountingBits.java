/* easy
 Given an integer n, count the number of 1's in the binary representation of every number in the range [0, n].

Return an array output where output[i] is the number of 1's in the binary representation of i.

Example 1:

Input: n = 4

Output: [0,1,1,2,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100

Constraints:

0 <= n <= 1000

 */

class Solution {
    public int[] countBits(int n) {
          int[] arr= new int[n+1];
        
        if(arr.length==1){
            return arr;
        }
        
        arr[0]=0;
       
        for(int j=1;j<=n;j++){
            int count=0;
            int i=j;
            while(i!=0){
                if((i&1)==1){
                    count++;
                }
                i=i>>>1;
            }
            arr[j]=count;
        }
        return arr;
    }
}