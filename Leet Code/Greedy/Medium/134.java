//134. Gas Station


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr  = 0;
        int total  = 0;
        int candidate= 0;
        
        for(int i=0;i<gas.length;i++){
            curr+=gas[i] - cost[i];
            total+=gas[i]-cost[i];
            
            if(curr<0){
                candidate = i+1;
                curr=0;
                
            }
        }
        
        if(total>=0)
            return candidate;
        else
            return -1;
        
    }
}