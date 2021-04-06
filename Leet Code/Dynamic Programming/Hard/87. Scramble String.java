

//87. Scramble String


class Solution {
    
    Map<String,Boolean> map;
    
    private boolean solve(String s1, String s2){
        
        String key = s1 + "_" + s2;
        if (map.containsKey(key)) return map.get(key);
        
        
         if (s1.compareTo(s2) == 0) {
            map.put(key, true);
            return true;
        }
         
        if(s1.length()<=1) {
            map.put(key, false);
            return false;
        }
         int n=s1.length();
         boolean flag =false;
        
        for(int i=1;i<=n-1;i++){
            
            boolean cond1  =  solve(s1.substring(0,i),s2.substring(n-i,n)) && solve(s1.substring(i,n),s2.substring(0,n-i));
            
 boolean cond2  =  solve(s1.substring(0,i),s2.substring(0,i)) && solve(s1.substring(i,n),s2.substring(i,n));
            if(cond1 || cond2){
                flag  = true;
                break;
            }
        }
         map.put(key, flag);
        
        return flag;
     }
    
    public boolean isScramble(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
         if (s1.compareTo(s2) == 0)
            return true;
        
         if (s1.length() == 0 || s2.length() == 0)
            return false;
        
        map =  new HashMap<>();
        
        return solve(s1,s2);
        
       
        
    }
}