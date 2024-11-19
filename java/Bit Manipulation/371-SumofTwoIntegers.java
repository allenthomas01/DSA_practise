/* medium
 Given two integers a and b, return the sum of the two integers without using the + and - operators.

Example 1:

Input: a = 1, b = 1

Output: 2
Example 2:

Input: a = 4, b = 7

Output: 11
Constraints:

-1000 <= a, b <= 1000
 */

class Solution {
    public int getSum(int a, int b) {
        int SUM=0;
        int CARRY;
        while(b!=0){
            CARRY=(a&b)<<1;
            a=a^b;
            
            b=CARRY;
        }

        return a;
        
    }
}