
//1816. Truncate Sentence

class Solution {
    public String truncateSentence(String s, int k) {
        String [] arr =  s.split(" ");
        StringBuilder sb  =  new StringBuilder();
        
        for(int i =0;i<k;i++){
            if(i!=k-1){
            sb.append(arr[i]);
            sb.append(" ");
            }
            else{
                sb.append(arr[i]);
            }
            
        }
        
        return sb.toString();
        
    }
}