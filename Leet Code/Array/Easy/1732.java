

//1732. Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int max= 0;
        int cmp= gain[0];
        max =  Math.max(cmp,max);
        for(int i=1;i<gain.length;i++){
            cmp = gain[i]+cmp;
            max = Math.max(cmp,max);
        }
        return max;
    }
}