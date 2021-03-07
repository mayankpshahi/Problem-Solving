

//1785. Minimum Elements to Add to Form a Given Sum

class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        
    long sum=0;
        
    int count=0;
        
    for(int i:nums) sum+=i;
        
    long diff =  Math.abs(goal - sum);
        
    count+=diff/limit;
    
    if(diff%limit!=0)count++;
        
    return count;
    
 
        
        
        
    }
}