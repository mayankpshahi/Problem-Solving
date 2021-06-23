



//1557. Minimum Number of Vertices to Reach All Nodes



class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res  =  new ArrayList<>();
        boolean seen[] =  new boolean[n];
        for(List<Integer> e:edges)
            seen[e.get(1)]=true;
        
        for(int i=0;i<n;i++)
            if(!seen[i]) res.add(i);
        
        
        return res;
        
            
        
    }
}