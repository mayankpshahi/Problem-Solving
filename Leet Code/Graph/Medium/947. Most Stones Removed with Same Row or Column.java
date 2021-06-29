





//947. Most Stones Removed with Same Row or Column


//Union Find

class Solution {
     int parent[];
    int rank[];
    int distinctGroups;
    public int removeStones(int[][] stones) {
        int n = stones.length;
        parent =  new int[n];
         rank =  new int[n];
        distinctGroups = n;
        Arrays.fill(parent,-1);
        for(int i = 0; i < stones.length; i++) {
            for(int j = 0; j < stones.length; j++) {
                if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    union( i, j);
                }
            }
        }

        return n-distinctGroups;
        
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
        if(xParent == yParent) return;
        //Else, merge x & y. Two groups are merged into one, so distinctGroups--.
        distinctGroups--;
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


//