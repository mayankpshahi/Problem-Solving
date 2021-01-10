//1720. Decode XORed Array

class Solution {
    public int[] decode(int[] encoded, int first) {
        int decode [] = new int[encoded.length+1];
        decode[0] = first;
        for(int i=1;i<decode.length;i++) decode[i] = decode[i-1]^encoded[i-1];
        
        return decode;
    }
}