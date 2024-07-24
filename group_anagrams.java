class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String,ArrayList<String>> map = new HashMap<>();

        //iterate for each word in strs
        for(String word: strs){

            int[] charcount = new int[26];
            StringBuilder stringbuilder = new StringBuilder();
            
            char[] charwords = word.toCharArray();

            // get the count of each characters in the word
            for(int i=0;i<charwords.length;i++){
                charcount[charwords[i]-'a']++;           
                                                
            }

            // according to charactercount, append character and its count to form a key string.
            for(int i=0;i<charcount.length;i++){
                if(charcount[i]!=0){
                    stringbuilder.append((char)(97+i));
                    stringbuilder.append(charcount[i]);                  
                }
            }

            //convert to normal string from stringbuilder
            String newstring = new String(stringbuilder);
            
            //check whether key string is in map, if found add words as arraylist,else create arraylist and then add words. 
            if(map.containsKey(newstring)){
                map.get(newstring).add(word);
            }else{
                map.put(newstring,new ArrayList<>());
                map.get(newstring).add(word);
            }
            
            
        }

        return new ArrayList<>(map.values());
    }
}