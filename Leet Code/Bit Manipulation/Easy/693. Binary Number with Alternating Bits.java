

//693. Binary Number with Alternating Bits

class Solution {
    public boolean hasAlternatingBits(int n) {
        
        n = n ^ (n>>1);
        return (n & n+1) == 0;
        
    }
}