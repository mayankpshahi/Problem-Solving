
//1859. Sorting the Sentence

class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        
        StringBuilder sb  =  new StringBuilder();
        
        for(int i=1;i<=arr.length;i++){
            for(String a: arr){
                
                
                int p = Character.getNumericValue(a.charAt(a.length()-1)); 
                
                
                if(p==i && i!=arr.length){
                    StringBuilder sb1 = new StringBuilder(a);
                sb1.deleteCharAt(sb1.length()-1);
                String val =  String.valueOf(sb1);
                    sb.append(val);
                    sb.append(" ");
                }
                if(p==i && i==arr.length){
                    StringBuilder sb1 = new StringBuilder(a);
                sb1.deleteCharAt(sb1.length()-1);
                String val =  String.valueOf(sb1);
                    sb.append(val);
                    //sb.append(" ");
                }
                
            }
        }
        
        return String.valueOf(sb);
        
    }
}