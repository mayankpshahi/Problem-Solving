//763. Partition Labels



//O(n) and O(1)
class Solution {
    public List<Integer> partitionLabels(String S) {
        if(S == null || S.length() == 0){
            return null;
        }
        
        List<Integer> output = new ArrayList<>();
        
        int[] last_index = new int[26];
        for(int i = 0; i < S.length(); i++){
            last_index[S.charAt(i)-'a'] = i;
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i < S.length(); i++){
            end = Math.max(end, last_index[S.charAt(i)-'a']);
            if(end == i){
                output.add(end - start + 1);
                start = end + 1;
            }
        }
        return output;
        
    }
}