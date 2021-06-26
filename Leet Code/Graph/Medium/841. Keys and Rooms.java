



//841. Keys and Rooms

class Solution {
    boolean vis[];
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        vis = new boolean[rooms.size()];
        vis[0]=true;
        dfsOfGraph(rooms.size(),rooms);
        for(boolean b:vis)
            if(!b)return false;
        
        return true;
    }
public void dfs(int node, List<List<Integer>> adj){
        vis[node] = true; 
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                dfs(it, adj); 
            }
        }
    }
    public void dfsOfGraph(int V, List<List<Integer>> adj)
    {
        for(int i = 0;i<V;i++) {
            if(vis[i]) dfs(i, adj); 
        }
        
    }
}