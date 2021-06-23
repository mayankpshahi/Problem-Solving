




//797. All Paths From Source to Target


class Solution {
    List<List<Integer>> adj;
    List<List<Integer>> res;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
         adj = new ArrayList<>();
         createAdj(graph);
         res = new ArrayList<>();
         List<Integer> path = new ArrayList<>();
         
        path.add(0);
        dfs(0,path);
        
        return res;
        
    }
    private void dfs(int node,List<Integer> path){
        if(node == adj.size()-1){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        
        for(int i:adj.get(node)){
            path.add(i);
            dfs(i,path);
            path.remove(path.size()-1);
        }
    }
    private void createAdj(int[][]graph){
        for(int i=0;i<graph.length;i++){
             List<Integer> l=  new ArrayList<>();
             for(int e:graph[i]){
                 l.add(e);
                 
             }
            adj.add(l);
        }
    }
}