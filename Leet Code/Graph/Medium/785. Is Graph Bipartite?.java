



//785. Is Graph Bipartite?



class Solution {
    List<List<Integer>> adj;
    public boolean isBipartite(int[][] graph) {
        int n=  graph.length;
        adj =  new ArrayList<>();
        
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        
        for(int i=0;i<n;i++){
              for(int j=0;j<graph[i].length;j++){
            adj.get(i).add(graph[i][j]);
            adj.get(graph[i][j]).add(i);
              }
            
        }
        
        int color [] =  new int[n];
        
        Arrays.fill(color,-1);
        
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(i,color))
                    return false;
            }
        }
        
        return true;
        
    }
     private boolean dfs(int node,int color[]){
        for(Integer it: adj.get(node)) {
			if(color[it] == -1) {
				color[it] = 1 - color[node]; 

				if(!dfs(it,color)) 
					return false; 
			}
			else if(color[it] == color[node]) {
				return false; 
			}
		}
		return true; 

    }
}