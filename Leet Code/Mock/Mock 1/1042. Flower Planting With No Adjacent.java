

//1042. Flower Planting With No Adjacent

class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        Map<Integer,ArrayList<Integer>> graph =  new HashMap<>();
        for (int i = 1; i <= n; i++) graph.put(i, new ArrayList<>());
        for(int p[]:paths){
            graph.get(p[0]).add(p[1]);
            graph.get(p[1]).add(p[0]);
        }
        int res [] = new int[n];
        for(int i=1;i<=n;i++){
            int [] color = new int[5];
            
            for (int j : graph.get(i))
                color[res[j-1]] = 1;
            
            for(int j=1;j<=4;j++){
                if(color[j]==0){
                    res[i-1]=j;
                    break;
                }
            }
            
        }
        
        return res;
        
    }
}