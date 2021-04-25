




//1839. Longest Substring Of All Vowels in Order




class Solution {
    
    public int longestBeautifulSubstring(String word) {
        
        String comp = "aeiou\0";
        
        char[] s = word.toCharArray();
        if(s.length < 5)
            return 0;
        
       int ind = 0, maxlen = 0, count = 0;
        
         
        for (int i = 0; i < s.length; i++)
        {
 
           
            if( ind == 0 && s[i] == comp.charAt(ind)){
                ind++;
                count++;
            }
            else if(ind != 0 && s[i] == comp.charAt(ind-1))
                count++;
            else if(s[i] == comp.charAt(ind)){
                ind++;
                count++;
            }
            else if(s[i] != comp.charAt(ind)){
                ind = 0;
                count = 0;
                if(s[i] =='a'){
                    ind++;
                    count++;
                }
            }
            if(ind > 4){
                maxlen = Math.max(maxlen, count);
            }
          
        }
        return maxlen;
        
    }
}




// More efficient code



class Solution {
    
    public int longestBeautifulSubstring(String word) {
        
         int cnt=1;
        int len=1;
        int max_length=0;
        
        int n=word.length();
        
        for(int i=1;i<n;i++){
            if(word.charAt(i)==word.charAt(i-1)){
                 len++;
            }else if(word.charAt(i-1)<word.charAt(i)){
                cnt++;
                len++;
            }else{
                len=1;
                cnt=1;
            }
            
            if(cnt==5){
                max_length=Math.max(max_length,len);
            }
        }
        return max_length;
    }
}


