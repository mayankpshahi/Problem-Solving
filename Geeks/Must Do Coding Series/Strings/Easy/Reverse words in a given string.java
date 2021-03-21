
//Reverse words in a given string 

class Solution {
    String reverseWords(String S) {
        // code here 
        if(S.isEmpty()){
            return S;
        } 
        
        String arr[] =  S.split("\\.");
        
       
        
        StringBuilder sb   =  new StringBuilder();
        
        
        for(int i=arr.length-1;i>0;i--){
             sb.append(arr[i]);
             sb.append(".");
        }
        sb.append(arr[0]);
        
        
    return sb.toString();
    }
}