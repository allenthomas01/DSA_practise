class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,res=0,maxfreq=0;

        Map<Character,Integer> charCount = new HashMap<>();

        for(int right=0;right<s.length();right++){
            charCount.put(s.charAt(right),charCount.getOrDefault(s.charAt(right),0) + 1 );
            
            maxfreq=Collections.max(charCount.values());
            
            while((right-left+1) - maxfreq > k){
                
                charCount.put(s.charAt(left), charCount.get(s.charAt(left))-1);
                left+=1;
            }
            
            
            res=Math.max(res,right-left+1);
            
        }
        
        
        return res;
    }
}