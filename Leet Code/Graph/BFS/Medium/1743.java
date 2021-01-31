



//1743. Restore the Array From Adjacent Pairs

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer,List<Integer>> h  = new HashMap<Integer, List<Integer>>();
        
        //Map adjacent element to each other adjaceny list
        for(int a[]:adjacentPairs){
             if(h.containsKey(a[0]))
                 h.get(a[0]).add(a[1]);
             else {
                 List<Integer> l = new ArrayList<Integer>();
                 l.add(a[1]);
                 h.put(a[0], l);
             }  
             
             if(h.containsKey(a[1]))
                h.get(a[1]).add(a[0]);
             else {
                 List<Integer> l = new ArrayList<Integer>();
                 l.add(a[0]);
                 h.put(a[1], l);
             }
        }
        
        int startnode=0;
        
        //Find the start node
        for(int key: h.keySet())
        {
            if(h.get(key).size()==1)
            {
                startnode=key;
                break;
            }
        }
        
         Queue<Integer> q = new LinkedList<Integer>();//Create a queue to apply bfs
         Set<Integer> s = new HashSet<Integer>();//Use set to keep track of visited node
        
        q.add(startnode);
        s.add(startnode);
        
        int j=0;
         int[] res = new int[adjacentPairs.length+1];
          while(!q.isEmpty()){

             int currnode = q.poll();
             List<Integer> ad = h.get(currnode);
             res[j] = currnode;
              j++;

             for(Integer curr:ad)
             {
                 if(!s.contains(curr)){
                     s.add(curr);
                      q.offer(curr);
                 }
             }
         }

        return res;
        
        
        
        
        
    }
}