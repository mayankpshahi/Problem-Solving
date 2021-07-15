




//1668. Maximum Repeating Substring



class Solution {
    public int maxRepeating(String sequence, String word) {
        int res  = 1;
        
        // while (sequence.contains(word.repeat(ans)))
        while(sequence.indexOf(word.repeat(res))>=0) res++;
        
        return res-1;
    }
}