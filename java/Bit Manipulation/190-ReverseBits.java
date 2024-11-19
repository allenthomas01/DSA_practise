/* easy
 Given a 32-bit unsigned integer n, reverse the bits of the binary representation of n and return the result.

Example 1:

Input: n = 00000000000000000000000000010101

Output:    2818572288 (10101000000000000000000000000000)
Explanation: Reversing 00000000000000000000000000010101, which represents the unsigned integer 21, gives us 10101000000000000000000000000000 which represents the unsigned integer 2818572288.


 */

class Solution{
    public int reverseBits(int n) {
     int res=0;
     int bit;
     for(int i=0;i<32;i++){
        res=res<<1;
        bit=n&1;
        res=res+bit;
        n=n>>1;
     }

     return res;
    }
}