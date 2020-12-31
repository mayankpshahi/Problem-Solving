//1081. Smallest Subsequence of Distinct Characters

class Solution {
    public String smallestSubsequence(String s) {
        Stack<Integer> st = new Stack<>();
        int [] last = new int[26],seen = new int[26];
        
        for (int i = 0; i < s.length(); ++i)
            last[s.charAt(i) - 'a'] = i;
        
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (seen[c]++ > 0) continue;
            while (!st.isEmpty() && st.peek() > c && i < last[st.peek()])
                seen[st.pop()] = 0;
            st.push(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i : st) sb.append((char)('a' + i));
        return String.valueOf(sb);
        
            
       
        
    }
}