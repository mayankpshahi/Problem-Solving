//659. Split Array into Consecutive Subsequences

class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> freq =  new HashMap<>();
        Map<Integer,Integer> hypo =  new HashMap<>();
        
        for(int i:nums)freq.put(i,freq.getOrDefault(i,0)+1);
        
        for(int i:nums){
            if(freq.get(i)==0) continue;
            if(hypo.getOrDefault(i,0)>0){
                hypo.put(i,hypo.get(i)-1);
                hypo.put(i+1,hypo.getOrDefault(i+1,0)+1);
                freq.put(i,freq.get(i)-1);
            }
            else if(freq.getOrDefault(i,0)>0 && freq.getOrDefault(i+1,0)>0 && freq.getOrDefault(i+2,0)>0){
                freq.put(i,freq.get(i)-1);
                freq.put(i+1,freq.get(i+1)-1);
                freq.put(i+2,freq.get(i+2)-1);
                hypo.put(i+3,hypo.getOrDefault(i+3,0)+1);
                
                
            }
            else 
                return false;
        }
        
        return true;
        
        
        
    
        
    }
}