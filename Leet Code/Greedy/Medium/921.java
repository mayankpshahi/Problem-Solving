//921. Minimum Add to Make Parentheses Valid


class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Integer> st =  new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='(')st.push(1);
            else if(S.charAt(i)==')'){
                if(st.isEmpty() || st.peek()==2) st.push(2);
                else if(st.peek()==1) st.pop();
            }
        }
        int count=0;
        if(st.isEmpty()) count=0;
        else{
            while(st.isEmpty()!=true){
                count++;
                st.pop();
            }
        }
        
        
        return count;
        
    }
}