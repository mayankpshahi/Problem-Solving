//1726. Tuple with Same Product


class Solution {
   
        
    static int  countPairs(int arr[]) 
    { 
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int n=arr.length; 
        int count =0;
  
        for (int i=0; i<n; i++) 
        { 
            for (int j=i+1; j<n; j++) 
            { 
                int mul = arr[i]*arr[j]; 
                if (map.containsKey(mul)) {
                    map.put(mul,map.getOrDefault(mul,0)+1);
                    count+=(8*(map.getOrDefault(mul,1)));
                     }
  
                else map.put(mul,0); 
                
            } 
        }
        
       
        
        return count;
    } 
    public int tupleSameProduct(int[] nums) {
        return countPairs(nums);
        
    }
}