//290. Word Pattern


class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String  sarr[] = s.split(" ");
        
        
        if((pattern.length()==0 && sarr.length >0) || (pattern.length()>0 && sarr.length==0) ) return false;
        
        if(pattern.length()!=sarr.length)
            return false;
        
         
         Map<Character,String> m = new HashMap<Character,String>();
        
           for(int i =0;i<pattern.length();i++){
            char curr1 = pattern.charAt(i);
            String curr2 = sarr[i];
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