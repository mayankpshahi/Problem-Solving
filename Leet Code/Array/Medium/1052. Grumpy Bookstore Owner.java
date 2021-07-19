



//1052. Grumpy Bookstore Owner

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int min) {
       int sum = 0; 
        
        for(int i = 0; i < customers.length; i++)
        {
            if(grumpy[i] == 0)
            {
                sum+=customers[i];
            }
        }
        
        int satisfaction = sum; 
        int start = 0; 
        int end = start + min - 1;
        int tempSum = 0; 
        
        for(int i = start; i <= end;i++)
        {
            if(grumpy[i] == 1)
            {
                tempSum+= customers[i]; 
            }
        }
        
        int maxWindowSum = tempSum; 
        start++;
        end++;
        while(end < customers.length)
        {
            if(grumpy[start-1] == 1)
            {
                tempSum = tempSum - customers[start-1]; 
            }
            if(grumpy[end] == 1)
            {
                tempSum = tempSum + customers[end];
            }
            
            maxWindowSum = Math.max(tempSum, maxWindowSum);
            start++; 
            end++; 
        }
        
        return (satisfaction + maxWindowSum); 
        
    }
}
















//TLE



class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int min) {
        int start  = 0;
        int end = start+min -1;
        int satisfied = Integer.MIN_VALUE;
        while(end <customers.length){
            int curr =0;
            for(int i=0;i<customers.length;i++){
                if(grumpy[i]==1 && (i<start || i>end)) continue;
                
                curr+=customers[i];
            }
            
            satisfied =  Math.max(satisfied,curr);
            start++;
            end++;
            
        }
        
        return satisfied;
        
    }
}