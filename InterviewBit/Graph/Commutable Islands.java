




//Commutable Islands



public class Solution {
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
          // Vertices starts from 1 , so indexing start from 1.
   
     // Minimum Cost
    int mstCost = 0;
    // Adjacency List representation
    ArrayList<ArrayList<ArrayList<Integer>>> edgeList  = new ArrayList<>();
    for(int i=0; i<=A; i++)
        edgeList.add(new ArrayList<>());
    // Remember visited node.
    boolean visited[] = new boolean[A+1];
    // set first to visited and 0 cost to visit first node
    visited[1] = true;

    
    // Converting edges (undirected) to Adjaceny List represtation (directed).
    for(ArrayList<Integer> i: B){
        edgeList.get(i.get(0)).add(i);
        edgeList.get(i.get(1)).add(new ArrayList<Integer>(Arrays.asList(i.get(1),i.get(0),i.get(2))));   
    }
    
    // Priority queue with cost as priority. 
    Queue<ArrayList<Integer>> q = new PriorityQueue<>(B.size(), (a,b)->a.get(2)-b.get(2));
    
    // Add all edges starting from node 1.
    q.addAll(edgeList.get(1));
    
    while(!q.isEmpty()){
        //Extract the min edge from current set of vertices.
        ArrayList<Integer> e = q.poll();
        int tempCost = e.get(2);
        int nextNode = e.get(1);
        
        // if the edge connects to visited edge pick next edge.
        if(visited[nextNode])
            continue;
        
        // Add the cost to visit next vertice and mark it as visited.
        mstCost += tempCost;
        visited[nextNode] = true;
        
        // Add all edges from next vertice.
        q.addAll(edgeList.get(nextNode));
        
        
    }

    return mstCost;
    
    }
}
