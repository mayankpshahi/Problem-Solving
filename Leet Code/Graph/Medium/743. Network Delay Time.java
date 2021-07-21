




//743. Network Delay Time


//DFS + Bruteforce


class Solution {
    List<List<Pair<Integer,Integer>>> adj;
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
        adj =  new ArrayList<>();
        
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        
        for(int t[]:times){
            adj.get(t[0]-1).add(new Pair(t[1]-1,t[2]));
        }
        
        int visit [] = new int[n+1];
        Arrays.fill(visit,Integer.MAX_VALUE);
        
        dfs(k-1,0,visit);
        
        int res = 0;
        for (int i=0; i<n; i++) {
            res = Math.max(res, visit[i]);
        }
       return res == Integer.MAX_VALUE ? -1 : res;
        
    
        
        
        
    }
   private void dfs(int i, int curr,  int visit []) {
        if (visit[i] <= curr)
            return;
        visit[i] = curr;
        for (Pair<Integer,Integer> p:adj.get(i)) {
            dfs(p.getKey(), curr + p.getValue(), visit);
        }
    }
}




//Priority Queue Dijikstra



class Solution {
    public class Edge{
        int dst;
        int wt;
        Edge(int dst , int wt){
            this.dst = dst;
            this.wt = wt;
        }
    }
    public class pair{
        int v;
        int dist;
        pair(int v, int dist){
            this.v = v;
            this.dist = dist;
        }
    }
    public int networkDelayTime(int[][] times, int N, int K) {
        ArrayList<Edge>[] graph = new ArrayList[N+1];
        for(int i=0;i<N+1;i++) graph[i] = new ArrayList<>();
        for(int i = 0; i<times.length; i++){
            Edge newE = new Edge(times[i][1],times[i][2]);
            graph[times[i][0]].add(newE);
        }
        
        pair src = new pair(K,0);
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
           return a.dist-b.dist;
        });
        pq.add(src);
        int [] len = new int[N+1];
        Arrays.fill(len,(int)1e8);
        len[K] = 0;
        int time = 0;
        while(pq.size()!=0){
            pair rvtx = pq.remove();
            for(Edge e : graph[rvtx.v]){
                pair tmp = new pair(e.dst, e.wt + rvtx.dist);
                if(len[tmp.v]>tmp.dist){
                    pq.add(tmp);
                    len[tmp.v] = e.wt+rvtx.dist;
                }
            }
        
    }
        for(int i=1;i<=N;++i)
        {
            if(len[i]==(int)1e8)
                return -1;
            time = Math.max(time,len[i]);
        }
            return time;
    }
}


