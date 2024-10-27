/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
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
