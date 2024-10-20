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
