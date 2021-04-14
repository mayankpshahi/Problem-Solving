

//76. Minimum Window Substring

class Solution {
    public String minWindow(String s, String t) {
        
    if(s == null || t.length() > s.length() || s.length() == 0)
        return "";
    
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
       
        char arr[] =  s.toCharArray();
        
         for(char c : t.toCharArray())
             map.put(c,map.getOrDefault(c,0)+1);
        
        int i=0;
        
        int start = 0;
        int len = arr.length+1;
        int count =0 ;
        for(int j=0;j<arr.length;j++){
               if(map.containsKey(arr[j])){
                 map.put(arr[j],map.get(arr[j])-1);
                   
              if(map.get(arr[j]) >= 0)
                count ++;
                   
                while(count == t.length()){
                if(j-i+1 < len){
                    start = i;
                    len = j-i+1;
                }
                
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                    
                    if(map.get(arr[i]) > 0)
                        count --;
                    
                }
                i++ ;
         }
   }
                 
}
        
return len>s.length()? "":s.substring(start,start+len);
    }
}