class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     
     		HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        
        ArrayList<Integer> list[] = new ArrayList[nums.length+1];

        for(int key:map.keySet()){
            int count = map.get(key);
            
            if(list[count]==null){
                list[count]= new ArrayList<>();
            }
            list[count].add(key);

        }
        
        
        int[] output = new int[k];
        int index=0;
        
        for(int i=list.length-1;i>=0;i--){
            if(list[i]!=null){
                for(int value:list[i]){
                    output[index++]=value;
                    if(index==k){
                        return output;
                    }
                }
            }
        }
        
        return output;


    }

    
}