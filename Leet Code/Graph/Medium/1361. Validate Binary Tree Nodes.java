


//1361. Validate Binary Tree Nodes



class Solution {
     int parent[];
    
    int distinctGroups;
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
         parent =  new int[n];
         //rank =  new int[n];
        distinctGroups = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            //rank[i]=1;
        }
        for (int i = 0; i < n; i++) {
            if (leftChild[i] >= 0 && !union(i, leftChild[i])) {
                return false;
            }
            if (rightChild[i] >= 0 && !union(i, rightChild[i])) {
                return false;
            }
        }
        
       return distinctGroups==1;
        
    }
     public int find(int x){
       while (x != parent[x]) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
    public boolean union(int x, int y){
        int xParent = find(x);
        int yParent = find(y);
        //If  parents are same it means x & y are already merged
        if(xParent == yParent || yParent!=y ) return false;
        //Else, merge x & y. Two groups are merged into one, so distinctGroups--.
        parent[yParent]=xParent;
        distinctGroups--;
       
        
        return true;
    }
}