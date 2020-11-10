
//20. Valid Parentheses

//O(n) Stack Solution
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') st.push(a);
            else if(st.empty()) return false;
            else if(a == ')' && st.pop() != '(') return false;
            else if(a == ']' && st.pop() != '[') return false;
            else if(a == '}' && st.pop() != '{') return false;
        }
        return st.empty();
        
        
    }
}

//Smarter Solution but time complexity is more i.e. O(n^2)
class Solution {
    public boolean isValid(String s) {
        
        int l;
    
        do {
            l = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while(l != s.length());
    
        return s.length() == 0;
        
    }
}