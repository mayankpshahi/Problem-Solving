




//1887. Reduction Operations to Make the Array Elements Equal


class Solution {
    public int reductionOperations(int[] nums) {
        
        
       Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else
                map.put(nums[i], 1);
        }
        
        
         
        
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparing(Pair::getKey)));
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet())pq.offer(new Pair <> (entry.getKey(), entry.getValue()));
        
        int count = 0;
        while(pq.size()>1){
          
        Pair<Integer,Integer> c = pq.poll();
        Pair<Integer,Integer> a = pq.poll();
            
          int freq = c.getValue();
             count+=c.getValue();
      
        Pair<Integer,Integer> b =  new Pair <> (a.getKey(), a.getValue()+freq);
            
        pq.offer(b);     
    }
        
        return count;
        
        
    }
}





//Other Solution

public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i] == nums[i-1]) continue;
            else sum += (nums.length - i);
        }
        return sum;
    }