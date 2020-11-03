//1614. Maximum Nesting Depth of the Parentheses

//O(N)
class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max =  0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            else if(s.charAt(i)==')') count--;
            if(count>max)max=count;
        }
        return max;

    }
}
