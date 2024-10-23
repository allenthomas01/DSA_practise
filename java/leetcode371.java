class Solution {
    public int getSum(int a, int b) {
        int SUM=0;
        int CARRY;
        while(b!=0){
            CARRY=(a&b)<<1;
            a=a^b;
            
            b=CARRY;
        }

        return a;
        
    }
}