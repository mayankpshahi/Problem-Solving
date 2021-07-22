



//210. Course Schedule II




class Solution {
    List<List<Integer>> adj;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
          adj = new ArrayList<>();
        
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        
        for(int[] e : prerequisites)
            adj.get(e[0]).add(e[1]);
        
        List<Integer> res =  new ArrayList<>();
        
         int vis[] = new int[numCourses];
        
           for(int i = 0;i<numCourses;i++) {
            
              if(!dfs(res,vis,i))return new int[0];
            
        }
        
        return res.stream().mapToInt(i -> i).toArray();
        
        
    }
    private boolean dfs(List<Integer> res,int vis[],int node){
         if(vis[node]==2) return true;
        if(vis[node]==1) return false;
        
        vis[node] = 1;
        
        for(int j=0; j<adj.get(node).size(); j++){
            if(!dfs(res, vis,adj.get(node).get(j))) return false;
        }
        vis[node] = 2;
        res.add(node);
        return true;
    }
}