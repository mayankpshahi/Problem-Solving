//746. Min Cost Climbing Stairs

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //mincost[i] = cost[i] + Math.min(cost[i-1],cost[i-2])
        
        int mincost[] = new int[cost.length+1];
        
        mincost[0] = cost[0];
        mincost[1] = cost[1];
        int n=cost.length;
        for(int i=2;i<n+1;i++){
            if(i!=n)
                mincost[i] = Math.min(mincost[i-1],mincost[i-2]) + cost[i];
            else
                mincost[i] = Math.min(mincost[i-1],mincost[i-2]);
        }
        
        return mincost[n];
    }
}