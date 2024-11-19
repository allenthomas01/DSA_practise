""" medium
Given two integers a and b, return the sum of the two integers without using the + and - operators.

Example 1:

Input: a = 1, b = 1

Output: 2
Example 2:

Input: a = 4, b = 7

Output: 11
Constraints:

-1000 <= a, b <= 1000"""

class Solution:
    def getSum(self, a: int, b: int) -> int:
        mask=0xffffffff

        while b!=0:
            CARRY = (a&b)<<1
            a=(a^b) & mask
            b=CARRY & mask


        if a > mask//2:
            return ~(a^mask)
        else:
            return a