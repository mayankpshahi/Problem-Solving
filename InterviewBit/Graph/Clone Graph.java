






//Clone Graph


/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    static HashMap<UndirectedGraphNode,UndirectedGraphNode> map;
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        
        map = new HashMap<>();
        HashSet<UndirectedGraphNode> visited = new HashSet<>();
        return cloneHelper(node, visited);
    }
    
    UndirectedGraphNode cloneHelper(UndirectedGraphNode node, HashSet<UndirectedGraphNode> visited){
        
        if(visited.contains(node)){
            return map.get(node);
        }
        
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(node,clone);
        visited.add(node);
        for(UndirectedGraphNode nbr : node.neighbors){
            UndirectedGraphNode cloneNbr = cloneHelper(nbr,visited);
            clone.neighbors.add(cloneNbr);
        }
        
        return clone;
    }
}
