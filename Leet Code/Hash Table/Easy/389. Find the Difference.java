

//389. Find the Difference

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map  = new HashMap<>();
        
        for(int i=0;i<t.length();i++){
           map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
        }
        char ans ='\0';
        
        for(char c:map.keySet()){
            int val = map.get(c);
            
            if(val ==1){
                ans =c;
                break;
            }
        }
        
        return ans;
        
    }
}