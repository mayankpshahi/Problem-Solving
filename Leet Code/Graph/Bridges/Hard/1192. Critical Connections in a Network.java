


//1192. Critical Connections in a Network

//Tarjan's Algo



class Solution {
    List<List<Integer>> res = new ArrayList<>();
    ArrayList<ArrayList<Integer>> adj;
    
    int[] disc;
    int[] low;
    boolean[] visited;
    int timer = 0;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        disc = new int[n];
        low = new int[n];
        visited = new boolean[n];
        
        createAdjacencyList(connections, n);
        dfs(0, -1);
        
        return res;
        
    }
    private void createAdjacencyList(List<List<Integer>> connections, int n) {
        adj = new ArrayList<>(n);
        while (adj.size() < n)
            adj.add(new ArrayList<Integer>());

        for (List<Integer> connection : connections) {
            int a = connection.get(0);
            int b = connection.get(1);
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
    }
    
    void dfs(int node, int parent) {

        visited[node] = true;
        disc[node] = timer;
        low[node] = timer;
        ++timer;

        for (int child : adj.get(node)) {
            if (child == parent)
                continue;
            else if (visited[child]) {
                low[node] = Math.min(low[node], disc[child]);
            } else {
                dfs(child, node);
                low[node] = Math.min(low[node], low[child]);
                if (low[child] > disc[node])
                    res.add(Arrays.asList(node, child));
            }
        }
    }
    
    
    
    
}