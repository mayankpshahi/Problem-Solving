

//Ways to color a 3xN Board



public class Solution {
     private long mod = 1000000007;
    public int solve(int n) {
         if (n == 0) return 0;

        long twoColors = 12;// how many way we have to paint grid using 2 colors on last row
        long threeColors = 24;

        while (--n > 0) {
            long temp = threeColors;
            threeColors = (11 * threeColors + 10 * twoColors ) % mod;
            twoColors = ( 5 * temp + 7 * twoColors ) % mod;
        }

        return (int)((twoColors + threeColors) % mod);
    }
}
