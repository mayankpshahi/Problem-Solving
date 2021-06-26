


//547. Number of Provinces



//union find Solution

class Solution {
    int parent[];
    int rank[];
    int distinctGroups;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parent =  new int[n];
         rank =  new int[n];
        distinctGroups = n;
        Arrays.fill(parent,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    union(i,j);
                }
            }
        }
        
        return distinctGroups;
        
        
        
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






//DFS Solution