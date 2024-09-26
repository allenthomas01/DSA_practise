class Solution {
    public int[] countBits(int n) {
          int[] arr= new int[n+1];
        
        if(arr.length==1){
            return arr;
        }
        
        arr[0]=0;
       
        for(int j=1;j<=n;j++){
            int count=0;
            int i=j;
            while(i!=0){
                if((i&1)==1){
                    count++;
                }
                i=i>>>1;
            }
            arr[j]=count;
        }
        return arr;
    }
}