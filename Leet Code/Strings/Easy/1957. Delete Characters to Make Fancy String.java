



//1957. Delete Characters to Make Fancy String


class Solution {
    public String makeFancyString(String s) {
        
        StringBuilder sb  =  new StringBuilder();
        
        int count = 1;
        char c =  s.charAt(0);
         sb.append(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==c){
                 count++;
                if(count<3)
                   sb.append(s.charAt(i));

            }else{
                sb.append(s.charAt(i));
                c = s.charAt(i);
                count=1;
            }
        }
        
        
        return sb.toString();
        
    }
}