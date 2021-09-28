

//1971. Find if Path Exists in Graph


//DFS

class Solution {
       List<List<Integer>> adj;
    public boolean validPath(int n, int[][] edges, int start, int end) {
         adj =  new ArrayList<>();
        
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        
        for(int e[]:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
            
        }
        boolean[] visited = new boolean[n];
        
      return  dfs(visited,start,end);
        
    }
    private boolean dfs(boolean[] visited,int start,int end){
        if(start==end)return true;
         visited[start] = true;
        for(int e:adj.get(start)){
             if(visited[e] == true)
                continue;
             if(e==end)
                return true; 
                
              if(dfs(visited,e,end))return true;
            
        }
        
        return false;
    }
}


//BFS


class Solution {
    List<List<Integer>> adj;
 public boolean validPath(int n, int[][] edges, int start, int end) {
      adj =  new ArrayList<>();
     
     for(int i=0;i<n;i++)adj.add(new ArrayList<>());
     
     for(int e[]:edges){
         adj.get(e[0]).add(e[1]);
         adj.get(e[1]).add(e[0]);
         
     }
 
     
   return  bfs(start,end,n);
     
 }
 private boolean bfs(int start,int end,int n){
      Queue<Integer> q = new LinkedList<>();
     boolean [] visited = new boolean [n];
     q.offer(start);
     visited[start] = true;
     while (!q.isEmpty()) {
         int size = q.size();
         for (int i=0; i<size; i++) {
             int currentNode = q.poll();
             if (currentNode == end)
                 return true;
             List<Integer> children = adj.get(currentNode);
             if (children == null)
                 continue;
             for (Integer child : children) {
                 if (child == end)
                     return true;
                 if (!visited[child]) {
                     q.offer(child);
                     visited[child] = true;
                 }
             }
         }
     }
     return false;
 }
}



//Union Find With Rank


class Solution {
    int parent[];
    int rank[];
 public boolean validPath(int n, int[][] edges, int start, int end) {
     
     parent =  new int[n];
      rank =  new int[n];
     Arrays.fill(parent,-1);
     
     for(int[]e:edges){
         union(e[0],e[1]);
     }
     
     return find(start)==find(end);
  
     
 }
  public int find(int x){
     if( parent[x]==-1 )
         return x;
     return parent[x] = find(parent[x]);
 }
 public void union(int x, int y){
     int xParent = find(x);
     int yParent = find(y);
     //If  parents are same it means x & y are already merged
     if(xParent == yParent) return;
     //Else, merge x & y. Two groups are merged into one, so distinctGroups--.
     if(rank[xParent] < rank[yParent]){
         parent[xParent] = yParent;
     }else if(rank[xParent] > rank[yParent]){
         parent[yParent] = xParent;
     }else{
         parent[xParent] = yParent;
         rank[yParent]++;
     }
 }
 

}



//Union Find without Rank


class Solution {
    int parent[];
 public boolean validPath(int n, int[][] edges, int start, int end) {
     
     parent =  new int[n];
     Arrays.fill(parent,-1);
     
     for(int[]e:edges){
         union(e[0],e[1]);
     }
     
     return find(start)==find(end);
  
     
 }
  public int find(int x){
     if( parent[x]==-1 )
         return x;
     return parent[x] = find(parent[x]);
 }
 public void union(int x, int y){
     int xParent = find(x);
     int yParent = find(y);
     //If  parents are same it means x & y are already merged
     if(xParent == yParent) return;
     //Else, merge x & y. Two groups are merged into one, so distinctGroups--.
     
     parent[xParent] = yParent;
     
 }
 

}


