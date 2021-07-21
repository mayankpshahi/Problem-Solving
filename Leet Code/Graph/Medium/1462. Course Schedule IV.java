





//1462. Course Schedule IV


class Solution {
     List<List<Integer>> adj;
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        adj = new ArrayList<>();
        
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        
        for(int[] e : prerequisites)
            adj.get(e[0]).add(e[1]);
        
        
        List<Boolean> res =  new ArrayList<>();
        
        //int i=0;
        for(int q[]:queries){
          boolean[] visited = new boolean[numCourses];
          res.add(dfs(q[0],q[1],visited));
          
        }
        
        return res;
    }
    private Boolean dfs(int node,int val,boolean[] visited){
        visited[node]=true;
        
        for(int i:adj.get(node)){
          if(i==val) return true;
          
          if(visited[i]==false){
                visited[i]=true;
                if(dfs(i,val,visited)==true){
                    return true;
                }
            }
        }
        
        
        return false;
        
        
    }
}