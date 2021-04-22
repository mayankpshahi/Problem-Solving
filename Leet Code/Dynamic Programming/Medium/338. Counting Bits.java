

//338. Counting Bits



class Solution {
    public int[] countBits(int num) {
         int[] count = new int[num + 1];
    for (int i=1; i<=num; i++) count[i] = count[i >> 1] + (i & 1);
    return count;
        
    }
}