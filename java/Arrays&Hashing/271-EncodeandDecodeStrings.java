/* medium
 Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

Please implement encode and decode

Example 1:

Input: ["neet","code","love","you"]

Output:["neet","code","love","you"]
Example 2:

Input: ["we","say",":","yes"]

Output: ["we","say",":","yes"]
Constraints:

0 <= strs.length < 100
0 <= strs[i].length < 200
strs[i] contains only UTF-8 characters.

 */

import java.util.*;
class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedstring = new StringBuilder();
        for(String str:strs){
            encodedstring.append(str.length());
            encodedstring.append('#');
            encodedstring.append(str);
        }
        return encodedstring.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            res.add(str.substring(i, i + length));
            i += length;
        }
        return res;

    }
}
