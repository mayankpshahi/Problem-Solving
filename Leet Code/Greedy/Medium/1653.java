//1653. Minimum Deletions to Make String Balanced

class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st  =  new Stack<>();
        
        int res = 0;
        
        for(int i = s.length()-1; i >=0; i--){
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek() < c){
                res++;
                st.pop();
            }else{
                st.push(c);
            }
        }
        
        return res;
        
    }
}