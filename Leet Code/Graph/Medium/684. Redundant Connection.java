



//684. Redundant Connection


class Solution {
    int parent[];
    int rank[];
    int res[];
    public int[] findRedundantConnection(int[][] edges) {
          int n = edges.length;
        parent =  new int[n];
         rank =  new int[n];
        res =  new int[2];
        Arrays.fill(parent,-1);
        for(int [] e:edges){
            union(e[0]-1,e[1]-1);
        }
        
        return res;
        
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
            res[0]=x+1;
            res[1]=y+1;
            return;
        }
        //Else, merge x & y. Two groups are merged into one, so distinctGroups--.
        //distinctGroups--;
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