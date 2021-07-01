





//1615. Maximal Network Rank




class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int [] connected = new int[n];
        boolean [][]roadExist =  new boolean[n][n];
        for(int c[]:roads){
            connected[c[0]]++;
            connected[c[1]]++;
            
            roadExist[c[0]][c[1]]=true;
            roadExist[c[1]][c[0]]=true;
        }
        int max =0 ;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int count = connected[i] + connected[j];
                
                if(roadExist[i][j])count--;
                
                
                max =  Math.max(max,count);
            }
            
        }
        
        
        return max;
        
    }
}