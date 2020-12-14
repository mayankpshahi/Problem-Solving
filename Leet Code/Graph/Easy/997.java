//997. Find the Town Judge

//O(n)
class Solution {
    public int findJudge(int N, int[][] trust) {
        int[]trustcount = new int[N+1];
        for(int[]t:trust){
            trustcount[t[0]]--;
            trustcount[t[1]]++;
        }
        for(int i=1;i<=N;i++){
            if(trustcount[i]==N-1)
                return i;
        
        }
        
        return -1;
        
    }
}