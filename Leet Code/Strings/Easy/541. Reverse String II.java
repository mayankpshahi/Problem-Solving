


//541. Reverse String II



class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb =  new StringBuilder();
        
        int i=0;
        
        while(i<s.length()){
            if(i+k<=s.length()){
            String val = reverse(s.substring(i,i+k));
            i+=k;
            sb.append(val);
             if(i+k<=s.length()){
           
            sb.append(s.substring(i,i+k));
            i+=k;
            }else{
               sb.append(s.substring(i,s.length()));
            i+=k;
            }
            }else{
                String val = reverse(s.substring(i,s.length()));
            i+=k;
            sb.append(val);
            
            
            }
            
           
            
            
            
        }
        
        return sb.toString();
        
    }
    private String reverse(String s){
        StringBuilder sb =  new StringBuilder();
        char []arr=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}