
//461. Hamming Distance

class Solution {
    public int hammingDistance(int x, int y) {
         int res = x^y;
        int count = 0;
        while(res != 0){
            if((res%2) != 0)
                count++;
            res /=2;
        }
        return count;
        
    }
}