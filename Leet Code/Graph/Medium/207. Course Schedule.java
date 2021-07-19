




//207. Course Schedule



class Solution {
    
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        
        for(int[] e : prerequisites)
            adj.get(e[1]).add(e[0]);
        
        return isCycle(numCourses,adj)?false:true;
        
        
    }
      private boolean isCycle(int V, List<List<Integer>> adj){
        int vis[] = new int[V];
        
        for(int i = 0;i<V;i++) {
            
                if(checkForCycle(i, -1, vis, adj))
                    return true; 
            
        }
        
        return false; 
    }
    private boolean checkForCycle(int node, int parent, int vis[], List<List<Integer>> adj) {
        vis[node] = 1; 
        for(Integer it: adj.get(node)) {
            if(vis[it] == 1) return true;
            if(vis[it] == 0) {
                if(checkForCycle(it, node, vis, adj) == true) 
                    return true; 
            }
           
        }
        
        vis[node]=2;
        
        
        return false; 
    }

}