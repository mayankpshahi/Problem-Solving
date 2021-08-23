//1974. Minimum Time to Type Word Using Special Typewriter

// Solution 1

class Solution {
    public int minTimeToType(String word) {
        int count =0;
        char c ='a';
            int clock=0;
            while(c!=word.charAt(0)){
                if(c=='z'){
                    clock++;
                    c='a';
                }else{
                clock++;
                c++;
                }
            }
            c =word.charAt(0);
             int anticlock=0;
            while(c!='a'){
                if(c=='z'){
                    anticlock++;
                    c='a';
                }else{
                anticlock++;
                c++;
                }
            }
            
            count+=Math.min(clock,anticlock)+1;
        
        for(int i=1;i<word.length();i++){
             c =word.charAt(i-1);
             clock=0;
            while(c!=word.charAt(i)){
                if(c=='z'){
                    clock++;
                    c='a';
                }else{
                clock++;
                c++;
                }
            }
            c =word.charAt(i);
              anticlock=0;
            while(c!=word.charAt(i-1)){
                if(c=='z'){
                    anticlock++;
                    c='a';
                }else{
                anticlock++;
                c++;
                }
            }
            
            count+=Math.min(clock,anticlock)+1;
            
        }
        
        return count;
        
        
    }
}



//Solution 2


public int minTimeToType(String word) {
        int cnt = 0;
        char prev = 'a';
        for (int i = 0; i < word.length(); ++i) {
            char cur = word.charAt(i);
            int diff = Math.abs(cur - prev);
            cnt += 1 + Math.min(diff, 26 - diff);
            prev = cur;
        }
        return cnt;
    }