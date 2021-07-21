


//1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance

//DFS +  BackTracking Brute Force

class Solution {
    List<Set<Integer>> res;
     List<List<Pair<Integer,Integer>>> adj;
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        adj  =  new ArrayList<>();
        res = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
             adj.add(new ArrayList<>());
             res.add(new HashSet<>());
        }
                              
        for(int edge[]:edges){
            adj.get(edge[0]).add(new Pair(edge[1],edge[2]));
            adj.get(edge[1]).add(new Pair(edge[0],edge[2]));
        }
        
       
    
        for(int i=0;i<n;i++){
           
            dfs(i,i,distanceThreshold,new HashSet<Integer>(),n);
            }
    int min = n;
     int max = 0;
        
    // for(int j=0; j<n; j++){
    //     System.out.println(res.get(j));
    // }
    
    for(int j=0; j<n; j++){
        min = Math.min(res.get(j).size(), min);
    }
    for(int j=0; j<n; j++){
        if(min==res.get(j).size()){
            max = Math.max(max, j);
            
        }
    }
    return max;
        
   
        
    }
    
    private void dfs(int i,int org, int th,Set<Integer> visited,int n){
        if(res.get(org).size()==n-1)
        return;
           List<Pair<Integer,Integer> > list =adj.get(i);
        for(Pair<Integer,Integer> p:list){
            if(p.getValue()<=th && org!=p.getKey() && !visited.contains(p.getKey())){
                res.get(org).add(p.getKey());
                visited.add(p.getKey());
                dfs(p.getKey(),org,th-p.getValue(),visited,n);
                visited.remove(p.getKey());
            }
        }
        
    }
}




//Floyd Warshall




public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dis = new int[n][n];
        int res = 0, smallest = n;
        for (int[] row : dis)
            Arrays.fill(row, 10001);
        for (int[] e : edges)
            dis[e[0]][e[1]] = dis[e[1]][e[0]] = e[2];
        for (int i = 0; i < n; ++i)
            dis[i][i] = 0;
        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; ++j)
                if (dis[i][j] <= distanceThreshold)
                    ++count;
            if (count <= smallest) {
                res = i;
                smallest = count;
            }
        }
        return res;
    }
