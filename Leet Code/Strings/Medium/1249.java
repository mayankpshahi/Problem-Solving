//1249. Minimum Remove to Make Valid Parentheses


//O(n)
class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] str = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<str.length;i++){
            char ch = str[i];
            if(ch==')'){
                if(st.isEmpty()) str[i] = '\0';
                else st.pop();
            } 
            else if(ch=='(') st.push(i);
        }
        
        while(st.size()>0) str[st.pop()] = '\0';
        
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length;i++) if(str[i] != '\0') sb.append(str[i]);
        return sb.toString();
        
        
    }
}

//O(n)

class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int open = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                open++;
            else if (arr[i] == ')') {
                if (open == 0)
                    arr[i] = '*';
                else
                    open--;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (open > 0 && arr[i] == '(') {
                arr[i] = '*';
                open--;
            }
        }

        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*')
                arr[p++] = arr[i];
        }

        return new String(arr).substring(0, p);
        
        
    }
}