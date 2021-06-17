



//Reverse Bits



public class Solution {
    public long reverse(long a) {
        long b = 0L;
        for(int i = 31; i >=0; i--){
        // In java it is always a good practice to suffice long values with L. Here it is mandatory for << operator to work as expected.
            if((a & 1L<<i) != 0){
                b = b | 1L<<(31-i);
            }
        }
        return b;
    }
}
