//893. Groups of Special-Equivalent Strings


//O(n^2)
class Solution {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> s = new HashSet<>();
        int res = 0;
        for(String str: A){            
            if(s.add(oddEvenSwap(str.toCharArray()))) {
                res++;
            }
        }
        return res;
    }
    private String oddEvenSwap(char[] chars){
        for(int i=0; i<chars.length;i++){            
            for(int j=i+2;j<chars.length;){
                if(chars[i] > chars[j]) {
                    char temp = chars[j];
                    chars[j] = chars[i];  
                    chars[i] = temp;
                }
                j+=2;
            }
        }
        
        return String.valueOf(chars);        
    }   
}


//Other way

class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> seen = new HashSet();
        for (String S: A) {
            int[] count = new int[52];
            for (int i = 0; i < S.length(); ++i)
                count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
            seen.add(Arrays.toString(count));
        }
        return seen.size();
    }
}