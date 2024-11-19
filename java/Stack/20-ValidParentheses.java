/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

/* easy
 You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false
Explanation: The brackets are not closed in the correct order.

Constraints:

1 <= s.length <= 1000
 */
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.size()==0){
                    return false;
                }
                if((s.charAt(i)==')' && stack.peek()=='(') || 
                (s.charAt(i)=='}' && stack.peek()=='{') ||
                (s.charAt(i)==']' && stack.peek()=='[')){
                    stack.pop();
                    continue;
                }else{
                    return false;
                }
            }
        }
        if (stack.isEmpty()){

        return true;
        }else{
            return false;
        }
    }
}
// @lc code=end
