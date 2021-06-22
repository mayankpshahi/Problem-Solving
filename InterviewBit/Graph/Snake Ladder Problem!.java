



//Snake Ladder Problem!



public class Solution {
    private Map<Integer, Integer> map;
   private boolean[] visited;
    public int snakeLadder(int[][] A, int[][] B) {
        map = new HashMap<>();
    visited = new boolean[101];
    
    for(int[] row : A){
        int u = row[0];
        int v = row[1];
        map.put(u, v);
    }
    
    for(int[] row : B){
        int u = row[0];
        int v = row[1];
        map.put(u, v);
    }
    return minRolls();
    }
    
    private int minRolls(){
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    
    int level = 1;
    
    while(!queue.isEmpty()){
        int size = queue.size();
        while(size-- > 0){
            int cn = queue.remove();
            
            visited[cn] = true;
            
            for(int i = 1; i <= 6; i++){
                int lp = cn + i;
                if(map.containsKey(lp)){
                    lp = map.get(lp);
                }
                
                if(lp == 100)
                    return level;
                
                if(!visited[lp]){
                    queue.add(lp);
                }
            }
        }
        level++;
    }
    
    return -1;
}
}
