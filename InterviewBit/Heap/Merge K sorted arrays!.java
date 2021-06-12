


//Merge K sorted arrays!


public class Solution {
    public int[] solve(int[][] A) {
         if (A==null||A.length==0) return null;
         
         int m = A.length , n = A[0].length;
        
        PriorityQueue<Integer> queue= new PriorityQueue<Integer>((m*n),new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                if (o1<o2)
                    return -1;
                else if (o1==o2)
                    return 0;
                else 
                    return 1;
            }
        });
        
       int res [] =  new int[(m*n)];
        
      for(int a[]:A){
          for(int i:a){
              queue.offer(i);
          }
      }
      
      int i=0;
            
        while (!queue.isEmpty()){
            res[i++] = queue.poll();
        }
        return res;
    }
}
