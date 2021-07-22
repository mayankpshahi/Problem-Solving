


//1514. Path with Maximum Probability

// Dfs Solution after a lot of tle


class Solution {
    double maxProb = 0;
    List<List<Pair<Integer,Double>>> adj;
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        adj = new ArrayList<>();
        
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
        }
        
        
        //boolean vis[] =  new boolean[n];// It causes tle coz no of calculation get increased
        
        double prob[] =  new double[n];
        
        double currProb = 1;
        
        dfs(start,end,prob,currProb);
        
        return maxProb;
        
    }
    private void dfs(int start, int end,double prob[], double currProb){
       if(currProb <= 1e-5) return;
      if(prob[start]>=currProb || maxProb>=currProb) return;
        prob[start]=currProb;
        if( start == end){
            maxProb =  Math.max(maxProb,currProb);
            return;
        }
        
      // vis[start] =  true ; 
        
        for(Pair<Integer,Double> p:adj.get(start)){
          // if(!vis[p.getKey()]){
                dfs(p.getKey(),end,prob,currProb*p.getValue());
           // }
        }
        //vis[start] =  false;
    }
}




//PriorityQueue Dijikstra



class Solution {
    double maxProb = 0;
    List<List<Pair<Integer,Double>>> adj;
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        adj = new ArrayList<>();
        
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
        }
        
        PriorityQueue<Dest> pq = new PriorityQueue<>(new Comparator<Dest>() {
			public int compare(Dest a, Dest b) {
                if(a.prob > b.prob) return -1;
                else return 1;
            }
        });
        
        pq.offer(new Dest(start,1));
        
        boolean vis[] =  new boolean[n];
        
        while(!pq.isEmpty()) {
            Dest d = pq.poll();
            int currNode = d.dest;
            
            if(vis[currNode]) 
                continue;
            
            vis[currNode] = true;
            
            double currDist = d.prob;
            
            if(currNode == end)
                return currDist;
        
             
                for(Pair<Integer,Double> t : adj.get(currNode)) {
                    if(!vis[t.getKey()]) {
                        pq.offer(new Dest(t.getKey(), currDist * t.getValue()));
                    }
                }
            
        }

        return 0;
        
        
        
    }
     class Dest {
        int dest;
        double prob;
        public Dest(int dest, double prob) {
            this.dest = dest;
            this.prob = prob;
        }
    }
    
}