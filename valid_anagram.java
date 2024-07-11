

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