

//1881. Maximum Value after Insertion


class Solution {
    public String maxValue(String n, int x) {
       if(n == null || n.length() == 0) return String.valueOf(x);
        if(n.charAt(0) != '-'){
            //positive
            for(int i = 0;i<n.length();i++){
                if(x > (n.charAt(i) - '0')){
                    return n.substring(0,i) + x + n.substring(i);
                }
            }
            return n + x;
        }else{
            for(int i = 1;i<n.length();i++){
                if(x < (n.charAt(i) - '0')){
                    return n.substring(0,i) + x + n.substring(i);
                }
            }
           return n + x;
        }
        
    }
}