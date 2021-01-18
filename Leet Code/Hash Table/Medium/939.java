//939. Minimum Area Rectangle





class Solution {
    public int minAreaRect(int[][] points) {
        HashMap<Integer,Set<Integer>> m =  new HashMap<>();
        
        //points = [[1,1],[1,3],[3,1],[3,3],[4,1],[4,3]]
        
        for(int p[]:points){
            if(!m.containsKey(p[0])){
                m.put(p[0],new HashSet<Integer>());
            }
            m.get(p[0]).add(p[1]);//m = {(1,{1,3}),(3,{1,3}),(4,{1,3})}
        }
        
        int minarea =  Integer.MAX_VALUE;
        
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int x1 = points[i][0];//x1 = [1,1,3,3,4]
                int y1 = points[i][1];//y1 = [1,3,1,3,1]
                int x2 = points[j][0];//x2 = [1,3,3,4,4]
                int y2 = points[j][1];//y2 = [3,1,3,1,3]
                
                if(x1!=x2 && y1!=y2){
                    if(m.get(x1).contains(y2) && m.get(x2).contains(y1))
                        minarea = Math.min(minarea, Math.abs(x1 - x2)*Math.abs(y1-y2));
                }
                
                
                
                
            }
        }
        
        return minarea == Integer.MAX_VALUE?0:minarea;
        
        
    }
}

