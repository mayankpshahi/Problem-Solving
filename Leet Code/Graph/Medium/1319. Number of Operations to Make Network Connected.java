





//1319. Number of Operations to Make Network Connected




//Union Find



class Solution {
     int parent[];
    int rank[];
    int distinctGroups;
    int extra;
    public int makeConnected(int n, int[][] c) {
         
        parent =  new int[n];
         rank =  new int[n];
        distinctGroups = n;
        extra =0;
        Arrays.fill(parent,-1);
        for(int i=0;i<c.length;i++){
            union(c[i][0],c[i][1]);
        }
    
        return extra>=distinctGroups-1?distinctGroups-1:-1;
        
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
        if(xParent == yParent){
            extra++;
            return;
        } 
        //Else, merge x & y. Two groups are merged into one, so distinctGroups--.
        distinctGroups--;
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





//DFS



class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1; // To connect all nodes need at least n-1 edges
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] c : connections) {
            graph[c[0]].add(c[1]);
            graph[c[1]].add(c[0]);
        }
        int components = 0;
        boolean[] visited = new boolean[n];
        for (int v = 0; v < n; v++) components += dfs(v, graph, visited);
        return components - 1; // Need (components-1) cables to connect components together
    }
    int dfs(int u, List<Integer>[] graph, boolean[] visited) {
        if (visited[u]) return 0;
        visited[u] = true;
        for (int v : graph[u]) dfs(v, graph, visited);
        return 1;
    }
}



//BFS


class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1; // To connect all nodes need at least n-1 edges
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] c : connections) {
            graph[c[0]].add(c[1]);
            graph[c[1]].add(c[0]);
        }
        int components = 0;
        boolean[] visited = new boolean[n];
        for (int v = 0; v < n; v++) components += bfs(v, graph, visited);
        return components - 1; // Need (components-1) cables to connect components together
    }
    int bfs(int src, List<Integer>[] graph, boolean[] visited) {
        if (visited[src]) return 0;
        visited[src] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        return 1;
    }
}