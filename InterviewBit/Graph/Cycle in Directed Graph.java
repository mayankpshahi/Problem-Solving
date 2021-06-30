


//Cycle in Directed Graph



public class Solution {
    ArrayList<ArrayList> graph;

public boolean isCyclicUtil(int i, boolean[] visited, boolean[] recstack) {
    if(recstack[i])
    return true;
    if(visited[i])
    return false;
    visited[i] = true;
    recstack[i] = true;
    List<Integer> children = graph.get(i);
    for(Integer c:children){
        if(isCyclicUtil(c, visited, recstack))
        return true;
    }
    recstack[i] = false;
    return false;
}

public void constructGraph(int[][] B) {
    for(int i=0;i<B.length;i++){
        int u = B[i][0];
        int v = B[i][1];
        graph.get(u-1).add(v-1);
    }
}

    public int solve(int A, int[][] B) {
         if(A==1) return 0;
    graph = new ArrayList<>();
    for(int i=0;i<A;i++){
        graph.add(new ArrayList());
    }
    constructGraph(B);
    boolean[] visited = new boolean[A];
    boolean[] recstack = new boolean[A];
    for(int i=0;i<A;i++){
        if(isCyclicUtil(i, visited, recstack))
        return 1;
    }
    return 0;
    }
}
