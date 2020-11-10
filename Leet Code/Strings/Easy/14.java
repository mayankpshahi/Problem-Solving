//14. Longest Common Prefix

//O(nlogn)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String start  = strs[0];
        String end  = strs[strs.length -1];
        int i = 0;
        while(i<start.length()){
            if(start.charAt(i) == end.charAt(i))
                i++;
            else break;
        }
        
        return i == 0?"":start.substring(0,i);
        
    }
}