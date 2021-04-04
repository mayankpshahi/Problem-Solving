

//1817. Finding the Users Active Minutes

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        Map<Integer,HashSet<Integer>>  m  =  new HashMap<>();
        
        for(int i = 0;i<logs.length;i++){
            
            HashSet s =  m.get(logs[i][0]);
            if(s==null){
                s = new HashSet<Integer>();
                s.add(logs[i][1]);
                m.put(logs[i][0], s);
            }
            
            s.add(logs[i][1]);
        }
        int [] arr = new int[k];
           
          for(Map.Entry<Integer,HashSet<Integer>> map:m.entrySet()){
              int size = map.getValue().size();
              arr[size-1]++;
              
              
          }
        
        return arr;
           
            
     }
}