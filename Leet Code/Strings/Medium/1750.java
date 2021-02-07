//1750. Minimum Length of String After Deleting Similar Ends

class Solution {
    public int minimumLength(String s) {
        
        if(s.length()==1)return 1;
        
        if(s.length()==2)
        {
            if(s.charAt(0)==s.charAt(1))return 0;
            else return 2;
        }
        
        int start = 0, end = s.length() - 1; 
        
        while(start < end && s.charAt(start) == s.charAt(end)) {
            char c = s.charAt(start);
            
            while(start <= end && s.charAt(start) == c)
                start++;
            
            
            while(end >= start && s.charAt(end) == c)
                end--;
        }
        
        return start>end?0:end-start+1;
        
    }
}