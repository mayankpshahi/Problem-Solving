




//959. Regions Cut By Slashes



class Solution {
    int[] parent , rank;
    int distinctGroups;
    public int regionsBySlashes(String[] grid) {
        int N = grid.length, unitSquares = N*N , quadrants = 4*unitSquares;
        
        distinctGroups = quadrants;
        parent = new int[quadrants]; Arrays.fill(parent, -1);
        rank = new int[quadrants];
        
        
        for (int r = 0; r < N; r++)
            for (int c = 0; c < N; c++) {
                int root = 4 * (r * N + c);
                char val = grid[r].charAt(c);
                if (val != '\\') {
                    union(root + 0, root + 1);
                    union(root + 2, root + 3);                    
                }
                if (val != '/') {
                    union(root + 0, root + 2);
                    union(root + 1, root + 3);
                }
               if (r + 1 < N)
                    union(root + 3, (root + 4 * N) + 0);
               
                // east west
                if (c + 1 < N)
                    union(root + 2, (root + 4) + 1);
               
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