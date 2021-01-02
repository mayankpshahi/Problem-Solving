//1686. Stone Game VI

class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int[][] combined = new int[aliceValues.length][];
        for(int i = 0; i < aliceValues.length; i++) {
            combined[i] = new int[]{aliceValues[i], bobValues[i]};
        }
        Arrays.sort(combined, (a1, a2) -> a2[0] + a2[1] - (a1[0] + a1[1]));
        
        int alicecnt = 0, bobcnt = 0, i = 0;
        boolean f = true;
        
        while(i < combined.length) {
            if(f) alicecnt += combined[i][0];
            else bobcnt += combined[i][1];
            i++;
            f= !f;
        }
        
        return Integer.compare(alicecnt, bobcnt);
    }
}