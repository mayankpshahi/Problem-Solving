//1217. Minimum Cost to Move Chips to The Same Position


class Solution {
    public int minCostToMoveChips(int[] position) {
        int count = 0;
        for(int i:position){
            if(i%2==0)count++;
        }
        return Math.min(count,position.length - count);
    }
}