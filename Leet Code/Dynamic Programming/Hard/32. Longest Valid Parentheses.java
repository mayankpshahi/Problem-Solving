


//32. Longest Valid Parentheses



class Solution {
    public int longestValidParentheses(String s) {
        char arr[] =  s.toCharArray();
        
        int n =  arr.length;
        
        int len  = 0;
        
        Stack<Integer> st =  new Stack<>();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == '(') st.push(i);
            else {
                if (!st.isEmpty()) {
                    if (arr[st.peek()] == '(') st.pop();
                    else st.push(i);
                }
                else st.push(i);
            }
        }
        
        if (st.isEmpty()) return n;
        else {
            int end = n, start = 0;
            while (!st.isEmpty()) {
                start = st.peek(); 
                st.pop();
                int validlen = end-start-1;
                len = len > validlen ? len : validlen;
                end = start;
            }
              len = len > end ? len : end;
        }
        
        
        return len;
        
        
        
    }
}