public class reverse_bits {
    public int reverseBits(int n) {
     int res=0;
     int bit;
     for(int i=0;i<32;i++){
        res=res<<1;
        bit=n&1;
        res=res+bit;
        n=n>>1;
     }

     return res;
    }
}