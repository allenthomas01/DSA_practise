/* easy
 Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.

 */



import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
                
        char[]  chars = s.toCharArray();

        HashMap<Character, Integer> hashmap = new HashMap<>();
    
        


        for(int i=0;i<chars.length;i++){
            if(hashmap.containsKey(chars[i])){
                hashmap.put(chars[i],hashmap.get(chars[i])+1);                              

            }else{
                hashmap.put(chars[i],1);
            }
        }

        chars = t.toCharArray();

        for(int i=0;i<chars.length;i++){
            if(hashmap.containsKey(chars[i])){
                hashmap.put(chars[i],hashmap.get(chars[i])-1);

            }else{
                hashmap.put(chars[i],1);
            }
        }
        
 
        for(char keys:hashmap.keySet()){
            if(hashmap.get(keys)==0){
                continue;
            }else{
                return false;
            }
        }

        return true;
        
    }
}