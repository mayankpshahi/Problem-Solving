

//1466. Reorder Routes to Make All Paths Lead to the City Zero




class Solution {
    ArrayList<ArrayList<Integer>> adj;
     boolean vis[];
    public int minReorder(int n, int[][] connections) {
         vis = new boolean[n];
        createAdjacencyList(connections, n);
        return dfs(0);
        
    }
    private void createAdjacencyList(int[][] connections, int n) {
        adj = new ArrayList<>(n);
        while (adj.size() < n)
            adj.add(new ArrayList<Integer>());

        for (int[] connection : connections) {
            int a = connection[0];
            int b = connection[1];
            adj.get(a).add(b);
           adj.get(b).add(-a);
        }
    }
    
    private int dfs(int root){
        int count =0;
        vis[root] = true; 
    
        for(int it: adj.get(root)) {
            if(vis[Math.abs(it)] == false) {
                
                count+=dfs(Math.abs(it)) + ((it>0)?1:0); 
            }
        }
        
        return count;

    }
}