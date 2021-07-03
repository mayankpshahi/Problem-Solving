





//Delete Edge!




public class Solution {
    private void dfs(ArrayList<ArrayList<Integer>>adj, int[] sum, int curr, int[] A){
    sum[curr] += A[curr];
    for(int i : adj.get(curr)){
        if(sum[i]==0){
            dfs(adj, sum, i, A);
            sum[curr] += sum[i];
        }
    }
}
    public int deleteEdge(int[] A, int[][] B) {
        int n = A.length;
   ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
   for(int i=0;i<n;i++)adj.add(new ArrayList<>());
    for(int v[] : B){
        (adj.get(v[0]-1)).add(v[1]-1);
        (adj.get(v[1]-1)).add(v[0]-1);
    }
    int[] sum =   new int[n];
    dfs(adj, sum, 0, A);
    int ans = Integer.MIN_VALUE;
    long mod = 1000000007;
    for(int v[] : B){
        long temp1 = Math.min(sum[v[0]-1], sum[v[1]-1]);
        long temp2 = sum[0] - temp1;
        int temp3 = (int)((temp1*temp2)%mod);
        ans = Math.max(temp3, ans);
    }
    return ans;
    }
    
}
