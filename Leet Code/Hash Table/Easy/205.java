//205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1) return true;
        
        if(s.length()!=t.length())
            return false;
        
        
        
        Map<Character,Character> m = new HashMap<Character,Character>();
    
        for(int i =0;i<s.length();i++){
            char curr1 = s.charAt(i);
            char curr2 = t.charAt(i);
            if(m.containsKey(curr1)){
                 if(m.get(curr1).equals(curr2))
                continue;
                else
                return false;
            }else{
                if(!m.containsValue(curr2))
                m.put(curr1,curr2);
                else return false;
                
            }
        }
        
        return true;
        
        
    }
}