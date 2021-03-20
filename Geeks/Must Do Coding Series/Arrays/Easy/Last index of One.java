

//Last index of One


class Solution {
    public int lastIndex( String s) {
        int ind =-1;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ind = i;
            }
        }
        
        return ind;
        
        
    }
}