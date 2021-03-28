

//Parenthesis Checker

class Solution
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st =  new Stack<Character>();
        
        for(int i=0;i<x.length();i++){
            if(x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '['){
                st.push(x.charAt(i));
            }
            if(st.isEmpty()) return false;
            
            if(x.charAt(i)==')'){
                if(st.peek() != '('  || st.isEmpty()) return false;
                else if(!st.isEmpty()) st.pop();
                
            }
            else if(x.charAt(i)=='}'){
                if(st.peek() != '{' || st.isEmpty()) return false;
                else if(!st.isEmpty()) st.pop();
                
            }
            else if(x.charAt(i)==']'){
                if(st.peek() != '[' || st.isEmpty() ) return false;
                 else if(!st.isEmpty()) st.pop();
                
            }
            
            
        }
        
        if(st.isEmpty()) return true;
        else return false;
    }
}
