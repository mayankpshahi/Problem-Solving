

//1528. Shuffle String



class Solution {
    public String restoreString(String s, int[] indices) {
        
        char [] s1 = s.toCharArray();
        
        char [] res = new char[s1.length];
        
        for(int i=0;i<s1.length;i++){
            res[indices[i]] = s1[i];
        }
        
        return String.valueOf(res);
        
    }
}