


//802. Find Eventual Safe States




class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
     List<Integer> res = new ArrayList<>();
    int color[] = new int[graph.length];
    for(int i = 0; i < graph.length; i++) {
        if( dfs(i, graph, color) )
            res.add(i);
    }
    return res;
}

public boolean dfs(int ind, int[][] graph, int[] color) {
    if( color[ind] > 0 )
        return color[ind] == 2;

    color[ind] = 1;
    for(int i = 0; i < graph[ind].length; i++) {
        if( color[graph[ind][i]] == 2 )
            continue;

        else if( color[graph[ind][i]] == 1 || !dfs(graph[ind][i], graph, color) )
            return false;
    }
    color[ind] = 2;
    return true;
}
}